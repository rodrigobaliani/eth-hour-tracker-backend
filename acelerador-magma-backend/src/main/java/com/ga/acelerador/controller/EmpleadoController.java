package com.ga.acelerador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ga.acelerador.service.EmpleadoService;

@RestController
@CrossOrigin
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService service;

}
