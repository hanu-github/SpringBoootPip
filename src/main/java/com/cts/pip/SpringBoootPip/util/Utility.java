package com.cts.pip.SpringBoootPip.util;

import java.util.ArrayList;
import java.util.List;

import com.cts.pip.SpringBoootPip.model.Book;

public class Utility {
	
	public static List<Book> bookList = new ArrayList<Book>();

	public static List<Book> findAll(){
		Book newbook=new Book();
		newbook.setId(11l);
		newbook.setAuthor("kurmathireddy");
		newbook.setTitle("java");
		
		Book ourbook=new Book();
		ourbook.setId(12l);
		ourbook.setAuthor("kurmathi");
		ourbook.setTitle("net");
		
		Book book3 =new Book();
		book3.setId(13l);
		book3.setAuthor("kurma");
		book3.setTitle("python");
		
		bookList.add(newbook);
		bookList.add(ourbook);
		bookList.add(book3);
		
		return bookList;		
		
	}
	
	public static Book getBook(Long id){
		
		System.out.println(id);
		bookList.stream().filter(b -> b.getId()>5l).map(b -> b.getId()).forEach(System.out::println);
		Book book = bookList.stream().filter(b -> id == b.getId()).findAny().get();
		
		return book;
	}
		
}
