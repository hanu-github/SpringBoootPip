package com.cts.pip.SpringBoootPip.service;

import java.util.List;

import com.cts.pip.SpringBoootPip.model.Book;

public interface BookService {
	
	 public List<Book> findAll();
	 public Book findOne(Long id);
	 public Book create( Book book);
	 public void delete( Long id);
	 public Book updateBook( Book book,  Long id);


}
