package com.cj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.models.FeedBack;
import com.cg.service.FeedBackService;

//import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/FeedBackController")
@CrossOrigin(origins = "http://localhost:4200")
public class FeedBackController {

	@Autowired
	FeedBackService serv;

	/*
	 * http://localhost:8081/FeedBackController/add
	 */
	@PostMapping(consumes = "application/json", produces = "application/json", path="/add")
	public ResponseEntity<FeedBack> addFeedBacks (@RequestBody FeedBack products)  {
		FeedBack products1= serv.addfeedback(products);

		ResponseEntity<FeedBack> response= new ResponseEntity<>(products1, HttpStatus.OK);
		return response;
	}


	 // http://localhost:8081/MyCartController/viewAll

	 @GetMapping(produces = "application/json",path = "/viewAll")
	public List< FeedBack> viewAllFeedBack(@PathVariable("Id") String email)
	{
		List< FeedBack> products= serv.getAllfeedBack();

		return products;
	}

}