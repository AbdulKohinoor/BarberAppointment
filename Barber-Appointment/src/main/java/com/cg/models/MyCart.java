package com.cg.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="mycart")
//@Table(name="mycart")
//@Builder
public class MyCart {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Cart_Id")
	private  int cartId;

	@Column(name="customer_Email")
	private String cEmail;


	@Column(name="barber_Id")
	private int barId;

	@Column(name="C_BarberName")
	private  String barberName;

	@Column(name="c_price")
	private int price;

	@Column(name="C_skills")
	private  String skills;

	@Column(name="C_status")
	private String cartStatus;

	public int getCartId() {
		return cartId;
	}
	public MyCart(int cartId, String cEmail, int barId, String barberName, int price, String skills,
			String cartStatus) {
		super();
		this.cartId = cartId;
		this.cEmail = cEmail;
		this.barId = barId;
		this.barberName = barberName;
		this.price = price;
		this.skills = skills;
		this.cartStatus = cartStatus;
	}
	public String getBarberName() {
		return barberName;
	}
	public void setBarberName(String barberName) {
		this.barberName = barberName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getCartStatus() {
		return cartStatus;
	}
	public void setCartStatus(String cartStatus) {
		this.cartStatus = cartStatus;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public int getBarId() {
		return barId;
	}
	public void setBarId(int barId) {
		this.barId = barId;
	}

	public MyCart() {
		super();
	}









}
