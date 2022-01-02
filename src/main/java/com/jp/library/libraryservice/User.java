package com.jp.library.libraryservice;

public class User {
	private String username;
	private String password;
	private String emailId;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", emailId=" + emailId + "]";
	}
	
	
	
	

}
