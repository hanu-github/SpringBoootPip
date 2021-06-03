package com.cts.pip.SpringBoootPip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pip.SpringBoootPip.dao.BookDao;
import com.cts.pip.SpringBoootPip.model.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}

	@Override
	public Book findOne(Long id) {
		// TODO Auto-generated method stub
		return bookDao.findOne(id);
	}

	@Override
	public Book create(Book book) {
		// TODO Auto-generated method stub
		return bookDao.create(book);
	}

	@Override
	public void delete(Long id) {
		
		bookDao.delete(id);
		// TODO Auto-generated method stub

	}

	@Override
	public Book updateBook(Book book, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
