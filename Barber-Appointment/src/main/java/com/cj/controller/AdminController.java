package com.cj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.models.Admin;
import com.cg.service.AdminServiceIf;
@RestController
public class AdminController {

	@Autowired
	private AdminServiceIf adminServiceIf;
	//@Autowired
    //private UserrServiceIf userrServiceIf;
	/*
	 * http://localhost:8081/admin/login
	 */
	//get admin details by name while login
	@PostMapping("/login")
	public Admin loginUser(@RequestBody Admin admin) {
		return adminServiceIf.fetchUserByemailIdAndPassword(admin);
	}
}




