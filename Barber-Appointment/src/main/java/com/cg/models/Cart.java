package com.cg.models;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name="cart")
//@Table(name="cart")
//@Builder
@Component
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Cart_Id")
	private  int cartId;
	@Column(name = "User_Id")
	private int userid;
	@Column(name = "Bsl_Id")
	private  int bslid;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getBslid() {
		return bslid;
	}
	public void setBslid(int bslid) {
		this.bslid = bslid;
	}

	public Cart(int cartId, int userid, int bslid) {
		super();
		this.cartId = cartId;
		this.userid = userid;
		this.bslid = bslid;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
}
