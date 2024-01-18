package com.cj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.models.MyCart;
import com.cg.service.MycartService;
import com.cj.exception.No_Data_Found;

@RestController
@RequestMapping("/MyCartController")
@CrossOrigin(origins = "http://localhost:4200")
public class MycartController {


	@Autowired
	MycartService serv;

	/*
	 * http://localhost:8081/MyCartController/add
	 */
	@PostMapping(consumes = "application/json", produces = "application/json", path="/add")
	public ResponseEntity<MyCart> addBarbers (@RequestBody MyCart products)  {
		MyCart products1= serv.addCart(products);

		ResponseEntity<MyCart> response= new ResponseEntity<>(products1, HttpStatus.OK);
		return response;
	}


	 // http://localhost:8081/MyCartController/viewById/{email}

	 @GetMapping(produces = "application/json",path = "/viewById/{Id}")
	public List< MyCart> viewCartById(@PathVariable("Id") String email)
	{
		List< MyCart> products= serv.getByEmail(email);

		return products;
	}

//		http://localhost:8081/MyCartController/updateStatus/{Id}
		@PutMapping("/updateStatus/{Id}")
		public void updateAvlable(@PathVariable Integer Id , @RequestBody MyCart product) throws  No_Data_Found {
			serv.changestatus(product, Id);

		}

}