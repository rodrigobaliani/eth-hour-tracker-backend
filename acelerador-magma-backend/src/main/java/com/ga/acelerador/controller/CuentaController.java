package com.ga.acelerador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ga.acelerador.service.CuentaService;

@RestController
@CrossOrigin
public class CuentaController {
	
	@Autowired
	private CuentaService service;

}
