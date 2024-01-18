package com.cg.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "Userr")
//@Table(name = "Userr")
//@Builder
//@ComponentScan
public class Userr{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Userr_id")
	private int UserrId;
	@Column(name = "Userr_email")
	private String emailId;
	@Column(name = "Userr_name")
	private String name;
	@Column(name = "Userr_password")
	private String password;
	public int getUserrId() {
		return UserrId;
	}
	public void setUserrId(int userrId) {
		UserrId = userrId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Userr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userr(int userrId, String emailId, String name, String password) {
		super();
		UserrId = userrId;
		this.emailId = emailId;
		this.name = name;
		this.password = password;
	}





	}






