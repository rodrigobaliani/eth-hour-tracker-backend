package com.ga.accelerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ga.accelerator.service.AssignedHoursService;

@RestController
@CrossOrigin
public class AssignedHoursController {
	
	@Autowired
	private AssignedHoursService service;

}
