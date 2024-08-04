package com.app.Services;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.CustomException.BookException;
import com.app.DTO.BookDTO;
import com.app.Entities.Book;
import com.app.Repositories.IBookRepository;

@Service
@Transactional
public class BookService implements IBookService {

	@Autowired
	private IBookRepository _bookRepository;
	
	@Autowired
	private ModelMapper mapper;
	@Override
	public Book insert(Book newBook) throws BookException {
		validatePublishDate(newBook);
		validateParam(newBook);
		return _bookRepository.save(newBook);
		
	}
	
	public void validatePublishDate(Book b) throws BookException {
		if(b.getPublishdate().isBefore(LocalDate.now())) {
			throw new BookException("Publish Date must be After Today!");
		}
	}
	
	public void validateParam(Book b) throws BookException {
		if(b.getAuthorName()=="" || b.getTitle()=="" || b.getCategory()==null) {
			throw new BookException("Author , Name nd Category cant be null");
		}
	}

	@Override
	public String update(Book book) {
		if(_bookRepository.existsById(book.getId())) {
			_bookRepository.save(book);
			return "Updated Successfully!";
		}else {
			return "Invalid ID";
		}
	}

	@Override
	public List<Book> findAllByauthorName(String name) {
		return _bookRepository.findAllByAuthorName(name);
	}

	@Override
	public List<BookDTO> getAllBooksDTO() {
		
		return (_bookRepository.findAll().stream()
				.map(m-> mapper.map(m, BookDTO.class))
				.collect(Collectors.toList())
				);
	}

	@Override
	public String deleteById(Long id) {
		if(_bookRepository.existsById(id)) {
			_bookRepository.deleteById(id);
			return "Deleted!";
		}
		return "Invalid Id!";
	}


}
