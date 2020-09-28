package com.ga.acelerador.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.ga.acelerador.service.implementation.EmpleadoServiceImplementation;
import com.ga.acelerador.util.Constants;
import com.ga.acelerador.dto.request.CollaboratorRequest;
import com.ga.acelerador.dto.response.CollaboratorResponse;
import com.ga.acelerador.model.Empleado;

@RestController
@CrossOrigin
public class EmpleadoController {
	
	@Autowired
	private EmpleadoServiceImplementation service;
	
	private final String entryPoint = Constants.Parameter.API_URL_SUFFIX;
	
	@GetMapping(entryPoint+"/empleado/get")
	public ResponseEntity <List<CollaboratorResponse>> getAll(){
		List<CollaboratorResponse> collaborators = service.getAll();
		
		return ResponseEntity.ok().body(collaborators);
	}
	@GetMapping(entryPoint+"/empleado/getByID/{id}")
	public ResponseEntity<CollaboratorResponse> get(@PathVariable Long id){
		CollaboratorResponse response =  service.get(id);
		
		return ResponseEntity.ok(response);
	}
	@PostMapping("/empleado/save")
	public ResponseEntity<CollaboratorResponse> save(@RequestBody CollaboratorRequest request) {
		CollaboratorResponse response = service.save(request);
		
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/empleado/{id}")
	public ResponseEntity<CollaboratorResponse> update(@PathVariable Long id, @RequestBody CollaboratorRequest request) {
		CollaboratorResponse response = service.update(id, request);
		
		return ResponseEntity.ok(response);
	}
	
	@DeleteMapping("/empleado/{id}")
	public ResponseEntity<CollaboratorResponse> delete(@PathVariable Long id) {
		CollaboratorResponse response = service.delete(id);
		
		return ResponseEntity.ok(response);
	}
	@GetMapping(entryPoint+"/empleado/contador")
	public ResponseEntity <String> contarEmpleados() {
		String contador = Long.toString(service.contarEmpleados());
		
		return ResponseEntity.ok().body(contador);
	}
}
