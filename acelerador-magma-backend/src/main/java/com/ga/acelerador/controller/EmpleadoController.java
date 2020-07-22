package com.ga.acelerador.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.ga.acelerador.service.EmpleadoService;
import com.ga.acelerador.model.Empleado;

@RestController
@CrossOrigin
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService service;
	
	@GetMapping("/api/empleado/get")
	public ResponseEntity <List<Empleado>> getAll(){
		List<Empleado> empleados = service.getAll();
		
		return ResponseEntity.ok().body(empleados);
	}
	
	@GetMapping("/api/empleado/contador")
	public ResponseEntity <String> contarEmpleados() {
		String contador = Integer.toString(service.contarEmpleados());
		
		return ResponseEntity.ok().body(contador);
	}
}
