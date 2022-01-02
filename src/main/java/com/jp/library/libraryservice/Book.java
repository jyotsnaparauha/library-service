package com.jp.library.libraryservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
	private String name;
	private String authour;
	@Override
	public String toString() {
		return "Book [name=" + name + ", authour=" + authour + "]";
	}
	public Book(String name, String authour) {
		super();
		this.name = name;
		this.authour = authour;
	}
	
	
}
