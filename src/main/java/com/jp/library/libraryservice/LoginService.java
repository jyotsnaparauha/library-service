package com.jp.library.libraryservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	 //@Override
	  public List<User> getAllUsers() throws DataAccessException {
		  return jdbcTemplate.query("SELECT * from library_user", BeanPropertyRowMapper.newInstance(User.class));
	  }
	  

}
