package com.jp.library.libraryservice;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.dao.DataAccessException;
	import org.springframework.jdbc.core.BeanPropertyRowMapper;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.stereotype.Service;

	@Service
	public class BookService {
		
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	 //@Override
	  public List<Book> getAllBooks() throws DataAccessException {
		  return jdbcTemplate.query("SELECT * from Book ", BeanPropertyRowMapper.newInstance(Book.class));
	  }

	

}
