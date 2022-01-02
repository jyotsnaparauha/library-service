package com.jp.library.libraryservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	BookService bookService;
	
	@GetMapping(path="/books", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book>>  getBooks() throws DataAccessException {			
		List<Book> books = bookService.getAllBooks();			
		return new ResponseEntity(books, HttpStatus.OK);		
	}
	
	@GetMapping(path="/users", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book>>  getUsers() throws DataAccessException {	
		List<User> allusers = loginService.getAllUsers();			   
		return new ResponseEntity(allusers, HttpStatus.OK);		
	}
	
	@GetMapping(path="/greeting/{username}")
	public ResponseEntity<String> getGreeting(@PathVariable String username) {
		return new ResponseEntity("Welcome in the app" + username, HttpStatus.OK);
	}
	
	@GetMapping(path="/login", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> validateLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
		System.out.println("username :"+username);
		System.out.println("password :" + password);
		Boolean result =  false;
		return new ResponseEntity(result, HttpStatus.OK);		
	}

}
