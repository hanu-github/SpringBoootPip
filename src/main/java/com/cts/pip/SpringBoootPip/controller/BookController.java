package com.cts.pip.SpringBoootPip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pip.SpringBoootPip.model.Book;
import com.cts.pip.SpringBoootPip.service.BookService;
import com.cts.pip.SpringBoootPip.util.ApiResponse;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/hello")   
	public String hello()   
	{  
		return "Hello";  
	}  
	
	@GetMapping("/findAll")
	public ResponseEntity<?> getBooks(){
		
		 List<Book> books = bookService.findAll();
		 
		 return new ResponseEntity<ApiResponse>(new ApiResponse(books,"Succsess"),HttpStatus.OK);
		
	}
	
	@GetMapping("/getBook/{id}")
	public ResponseEntity<?> getBookDetails(@PathVariable("id") Long id){
		
		  Book book = bookService.findOne(id);
		 
		 return new ResponseEntity<ApiResponse>(new ApiResponse(book,"Succsess"),HttpStatus.OK);
		
	}
	
}
