package com.insuranceapp.model;

import java.util.List;

public class AppUser {
	
	private String username;
	private Integer userId;
	private String password;
	private String email;
	private List<String> authorities;
	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppUser(String username, Integer userId, String password, String email, List<String> authorities) {
		super();
		this.username = username;
		this.userId = userId;
		this.password = password;
		this.email = email;
		this.authorities = authorities;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}
	@Override
	public String toString() {
		return "AppUser [username=" + username + ", userId=" + userId + ", password=" + password + ", email=" + email
				+ ", authorities=" + authorities + "]";
	}
	
	

}
