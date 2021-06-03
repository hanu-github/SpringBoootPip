package com.cts.pip.SpringBoootPip.dao;

import java.util.List;

import com.cts.pip.SpringBoootPip.model.Book;

public interface BookDao {
	
	 public List<Book> findAll();
	 public Book findOne(Long id);
	 public Book create( Book book);
	 public void delete( Long id);
	 public Book updateBook( Book book,  Long id);


}
