package com.cg.bookmanagementsystem.service;

import java.util.Date;
import java.util.List;

import com.cg.bookmanagementsystem.entity.Book;
import com.cg.bookmanagementsystem.exception.ResourceNotFoundException;

public interface IBookService {
	public Book addBook(Book book);
	public List<Book> listAllBooks();
	public Book getBookById(Long bookId)  throws ResourceNotFoundException;
	public Book updateBook(Book book,Long bookId) throws ResourceNotFoundException;
	public void deleteBook(Long bookId);
	public Book findByBookName(String bookName) ;
	public List<Book> findByBookCategory(String bookCategory);
	public List<Book> findByBookPriceLessThan(float bookPrice);
	public List<Book> findByBookPriceGreaterThan(float bookPrice);
	public List<Book> findByAuthorName(String authorName);
	public List<Book> findByDescription(String description);
	public List<Book> findByPublishingYear(Date publishingYear);
	
	
}
