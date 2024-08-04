package com.app.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Book;

public interface IBookRepository extends JpaRepository<Book, Long> {
	List<Book> findAllByAuthorName(String authorName);
}
