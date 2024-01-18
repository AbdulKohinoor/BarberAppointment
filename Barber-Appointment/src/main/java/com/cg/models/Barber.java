package com.cg.models;

import org.springframework.context.annotation.ComponentScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;





@Entity
@Table( name="barber")

@ComponentScan
public class Barber {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Barber_Id")
	private int barberId;

	@Column(name="Barber_Name")
	String name;

	@Column(name="Barber_Skills")
	String skills;

	@Column(name="ratings")
	 private int rating;


	@Column(name="Barber_Status")
	 private String status;


	@Column(name="serv_price")
	private  int price;



	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Barber() {
		super();
	}

	public int getBarberId() {
		return barberId;
	}

	public void setBarberId(int barberId) {
		this.barberId = barberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Barber(int barberId, String name, String skills, int rating, String status, int price) {
		super();
		this.barberId = barberId;
		this.name = name;
		this.skills = skills;
		this.rating = rating;
		this.status = status;
		this.price = price;
	}



}
