package com.cj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.models.BarberServiceList;
import com.cg.service.CartServicesIf;

@RestController
@RequestMapping("/cart")
public class Cartcontroller {


	@Autowired
	CartServicesIf cs;


	@CrossOrigin
	@GetMapping("/showcart/{useremail}")
	//get details of card with card id
	public List<BarberServiceList> getcart(@PathVariable String useremail ) {

		return cs.fetchCartDetails(useremail);
	}

	@CrossOrigin
	@DeleteMapping("/delete/{serviceId}/{useremail}")
	public String removeFromCart( @PathVariable String useremail, @PathVariable Integer serviceId)
	{

		cs.deleteItemFromCart(serviceId , useremail);
		return "Deleted";
	}


}