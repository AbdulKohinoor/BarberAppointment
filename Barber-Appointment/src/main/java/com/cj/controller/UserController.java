package com.cj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.models.Userr;
import com.cg.service.UserrServiceIf;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserrServiceIf userService;


	//http://localhost:8081/user/regester

	//save new user data
	@CrossOrigin
	@PostMapping("/regester")
	public Userr registerUser(@RequestBody Userr user)  {

	 return userService.SaveUserDetails(user);
	}

	//http://localhost:8081/user/login

	//fetch user for login authentication
	@CrossOrigin
	@PostMapping(value ="/login")
	public Userr loginUser(@RequestBody Userr user) {
		return userService.fetchUserByemailIdAndPassword(user);
	}

	//http://localhost:8081/user/{id}

   //see user user by id
	@CrossOrigin
	@GetMapping("/{id}")
	public Userr userbyid(@PathVariable("id") Integer userid)
	{
		return userService.fetchById(userid);
	}




}