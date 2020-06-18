package com.ga.acelerador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ga.acelerador.service.ProyectoService;

@RestController
@CrossOrigin
public class ProyectoController {
	
	@Autowired
	private ProyectoService service;
}
