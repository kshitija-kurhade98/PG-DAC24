package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTO.BookDTO;
import com.app.Entities.Book;
import com.app.Services.IBookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private IBookService _bookService;
	
	@PostMapping
	public Book insert(@RequestBody Book newBook) {
		Book b = null;
		try {
			b = _bookService.insert(newBook);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return b;
	}
	
	@PutMapping
	public String update(@RequestBody Book book) {
		return _bookService.update(book);
	}
	
	@GetMapping("/{author_name}")
	public List<Book> findAllByauthorName(@PathVariable String author_name){
		return _bookService.findAllByauthorName(author_name);
	}
	
	@GetMapping("/getAllBooksDTO")
	public List<BookDTO> getAllBooksDTO(){
		return _bookService.getAllBooksDTO();
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable Long id) {
		return _bookService.deleteById(id);
	}
}
