package com.ga.accelerator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ga.accelerator.dto.request.GlowContractRequest;
import com.ga.accelerator.dto.response.GlowContractResponse;
import com.ga.accelerator.service.implementation.GlowContractServiceImplementation;
import com.ga.accelerator.util.Constants;

@RestController
@CrossOrigin
public class GlowContractController {
	
	@Autowired
	private GlowContractServiceImplementation service;
	
	private final String entryPoint = Constants.Parameter.API_URL_SUFFIX;
	
	@GetMapping(entryPoint+"/contract")
	public ResponseEntity <List<GlowContractResponse>> getAll(){
		
		List<GlowContractResponse> contracts = service.getAll();
		return ResponseEntity.ok().body(contracts);
		
	}
	@GetMapping(entryPoint+"/contract/{id}")
	public ResponseEntity<GlowContractResponse> get(@PathVariable Long id){
		
		GlowContractResponse response =  service.get(id);
		return ResponseEntity.ok(response);
		
	}
	
	@PostMapping(entryPoint+"/contract")
	public ResponseEntity<GlowContractResponse> save(@RequestBody GlowContractRequest request) {
		
		GlowContractResponse response = service.save(request);
		return ResponseEntity.ok(response);
		
	}
	
	@PutMapping(entryPoint+"/contract/{id}")
	public ResponseEntity<GlowContractResponse> update(@PathVariable Long id, @RequestBody GlowContractRequest request) {
		
		GlowContractResponse response = service.update(id, request);
		return ResponseEntity.ok(response);
	}
	
	@DeleteMapping(entryPoint+"/contract/{id}")
	public ResponseEntity<GlowContractResponse> delete(@PathVariable Long id) {
		
		GlowContractResponse response = service.delete(id);
		return ResponseEntity.ok(response);
		
	}
}

