package com.ga.accelerator.controller;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ga.accelerator.service.UserService;

@RestController
@CrossOrigin
@Table(name = "user_account")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String initSystem() {
		return "Sweet Start";
	}
	
	@GetMapping("/hola")
	public String getHola() {
		return "Hola";
	}


}
