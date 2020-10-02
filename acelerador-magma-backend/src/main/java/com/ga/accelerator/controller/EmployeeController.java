package com.ga.accelerator.controller;
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

import com.ga.accelerator.dto.request.CollaboratorRequest;
import com.ga.accelerator.dto.response.CollaboratorResponse;
import com.ga.accelerator.model.Employee;
import com.ga.accelerator.service.implementation.EmployeeServiceImplementation;
import com.ga.accelerator.util.Constants;

@RestController
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImplementation service;
	
	private final String entryPoint = Constants.Parameter.API_URL_SUFFIX;
	
	@GetMapping(entryPoint+"/employee/get")
	public ResponseEntity <List<CollaboratorResponse>> getAll(){
		List<CollaboratorResponse> collaborators = service.getAll();
		
		return ResponseEntity.ok().body(collaborators);
	}
	@GetMapping(entryPoint+"/employee/getByID/{id}")
	public ResponseEntity<CollaboratorResponse> get(@PathVariable Long id){
		CollaboratorResponse response =  service.get(id);
		
		return ResponseEntity.ok(response);
	}
	@PostMapping("/employee/save")
	public ResponseEntity<CollaboratorResponse> save(@RequestBody CollaboratorRequest request) {
		CollaboratorResponse response = service.save(request);
		
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/employee/{id}")
	public ResponseEntity<CollaboratorResponse> update(@PathVariable Long id, @RequestBody CollaboratorRequest request) {
		CollaboratorResponse response = service.update(id, request);
		
		return ResponseEntity.ok(response);
	}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<CollaboratorResponse> delete(@PathVariable Long id) {
		CollaboratorResponse response = service.delete(id);
		
		return ResponseEntity.ok(response);
	}
	@GetMapping(entryPoint+"/employee/counter")
	public ResponseEntity <String> countEmployees() {
		String counter = Long.toString(service.countEmployees());
		
		return ResponseEntity.ok().body(counter);
	}
}
