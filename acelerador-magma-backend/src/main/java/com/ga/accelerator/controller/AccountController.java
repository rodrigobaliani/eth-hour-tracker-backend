package com.ga.accelerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ga.accelerator.service.AccountService;

@RestController
@CrossOrigin
public class AccountController {
	
	@Autowired
	private AccountService service;

}
