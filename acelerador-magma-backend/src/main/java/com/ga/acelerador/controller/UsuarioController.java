package com.ga.acelerador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ga.acelerador.service.UsuarioService;

@RestController
@CrossOrigin
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/")
	public String getHola() {
		return "Inició piola";
	}

}
