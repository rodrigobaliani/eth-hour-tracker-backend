package com.ga.acelerador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ga.acelerador.service.HorasAsignadasService;

@RestController
@CrossOrigin
public class HorasAsignadasController {
	
	@Autowired
	private HorasAsignadasService service;

}
