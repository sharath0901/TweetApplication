package com.registerlogin.micro.task01microregisterlogin.RestClient;

import java.time.LocalDate;



public class ClientUser {

	

	private String rusername;
	

	private String rdescription;

	private LocalDate rdate;

	private int rlikes;

	private String rreply;
	
	
	

	public ClientUser() {
		super();
	}

	
	
	
	
	
	public ClientUser(String rusername, String rdescription, int rlikes, String rreply) {
		super();
		this.rusername = rusername;
		this.rdescription = rdescription;
		this.rlikes = rlikes;
		this.rreply = rreply;
	}






	public ClientUser(String rusername, String rdescription, LocalDate rdate, int rlikes, String rreply) {
		super();
		this.rusername = rusername;
		this.rdescription = rdescription;
		this.rdate = rdate;
		this.rlikes = rlikes;
		this.rreply = rreply;
	}

	public String getRusername() {
		return rusername;
	}

	public void setRusername(String rusername) {
		this.rusername = rusername;
	}

	public String getRdescription() {
		return rdescription;
	}

	public void setRdescription(String rdescription) {
		this.rdescription = rdescription;
	}

	public LocalDate getRdate() {
		return rdate;
	}

	public void setRdate(LocalDate rdate) {
		this.rdate = rdate;
	}

	public int getRlikes() {
		return rlikes;
	}

	public void setRlikes(int rlikes) {
		this.rlikes = rlikes;
	}

	public String getRreply() {
		return rreply;
	}

	public void setRreply(String rreply) {
		this.rreply = rreply;
	}

	@Override
	public String toString() {
		return "ClientUser [rusername=" + rusername + ", rdescription=" + rdescription + ", rdate=" + rdate
				+ ", rlikes=" + rlikes + ", rreply=" + rreply + "]";
	}
	
	
	
	
	
}
