package com.cts.pip.SpringBoootPip.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.pip.SpringBoootPip.model.Book;
import com.cts.pip.SpringBoootPip.util.Utility;

@Repository
public class BookDapImpl implements BookDao {

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return Utility.findAll();
	}

	@Override
	public Book findOne(Long id) {
		// TODO Auto-generated method stub
		return Utility.getBook(id);
	}

	@Override
	public Book create(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Book updateBook(Book book, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
