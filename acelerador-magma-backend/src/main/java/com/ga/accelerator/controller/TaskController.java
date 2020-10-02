package com.ga.accelerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ga.accelerator.service.TaskService;

@RestController
@CrossOrigin
public class TaskController {
	
	@Autowired
	private TaskService service;
}
