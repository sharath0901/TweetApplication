package com.registerlogin.micro.task01microregisterlogin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class Users {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int     login_Id; 
	@Column
	private String 	email;	
	@Column
	private String	password;
	@Column
    private String  c_password;
	@Column
	private String 	first_name;
	@Column
	private String 	last_name;
	@Column(length = 10)
    private Long    contact_number;
	
	
	
	
	
	public Users() {
		super();
	}
	

	public Users(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public Users(String email, String password, String c_password, String first_name, String last_name) {
		super();
		this.email = email;
		this.password = password;
		this.c_password = c_password;
		this.first_name = first_name;
		this.last_name = last_name;
	}


	public Users(String email, String password, String c_password, String first_name, String last_name,
			Long contact_number) {
		super();
		this.email = email;
		this.password = password;
		this.c_password = c_password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.contact_number = contact_number;
	}

	public int getLogin_Id() {
		return login_Id;
	}

	public void setLogin_Id(int login_Id) {
		this.login_Id = login_Id;
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

	public String getC_password() {
		return c_password;
	}

	public void setC_password(String c_password) {
		this.c_password = c_password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Long getContact_number() {
		return contact_number;
	}

	public void setContact_number(Long contact_number) {
		this.contact_number = contact_number;
	}

	@Override
	public String toString() {
		return "User [login_Id=" + login_Id + ", email=" + email + ", password=" + password + ", c_password="
				+ c_password + ", first_name=" + first_name + ", last_name=" + last_name + ", contact_number="
				+ contact_number + "]";
	}

	
	
	
	
}
