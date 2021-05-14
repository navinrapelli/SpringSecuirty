package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {
	
	@Id
	String id;
	
	String username;
	String password;
	
	
public Users() {
		
	
	}
	
	
	

	@Override
public String toString() {
	return "Users [id=" + id + ", username=" + username + ", password=" + password + "]";
}







	public Users(String id, String username, String password ) {
		
		this.id = id;
		this.username = username;
		this.password = password;

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	
	
	
	
	

}
