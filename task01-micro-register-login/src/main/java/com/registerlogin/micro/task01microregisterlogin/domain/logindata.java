package com.registerlogin.micro.task01microregisterlogin.domain;




public class logindata {

	
	private String email;
	
	private String password;

	public logindata(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "logindata [email=" + email + ", password=" + password + "]";
	}
	
	
	
}
