package com.ga.accelerator.service;

import java.util.List;

import com.ga.accelerator.dto.request.CollaboratorRequest;
import com.ga.accelerator.dto.response.CollaboratorResponse;


public interface EmployeeService {
	
	CollaboratorResponse get(Long id);
	List<CollaboratorResponse> getAll();
	CollaboratorResponse save(CollaboratorRequest request);
	CollaboratorResponse update(Long id, CollaboratorRequest request);
	CollaboratorResponse delete(Long id);
	long countEmployees();
}
