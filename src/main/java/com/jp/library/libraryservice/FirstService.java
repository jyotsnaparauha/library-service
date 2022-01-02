package com.jp.library.libraryservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstService {
	
	@RequestMapping("/data")
	public String getData() {		
		//return new Book("Java ", "Abcd").toString();
		return "This is the response from server";
	}

}
