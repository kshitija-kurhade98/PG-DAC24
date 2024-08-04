package com.app.Services;

import java.util.List;

import com.app.CustomException.BookException;
import com.app.DTO.BookDTO;
import com.app.Entities.Book;

public interface IBookService {
	
	Book insert(Book newBook) throws BookException;
	
	String update(Book book);
	
	List<Book> findAllByauthorName(String name);
	
	List<BookDTO> getAllBooksDTO();
	
	String deleteById(Long id);

}
