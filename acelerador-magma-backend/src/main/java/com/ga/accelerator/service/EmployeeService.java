package com.ga.accelerator.service;

import java.util.List;

import com.ga.accelerator.dto.request.EmployeeRequest;
import com.ga.accelerator.dto.response.EmployeeResponse;


public interface EmployeeService {
	
	EmployeeResponse get(Long id);
	List<EmployeeResponse> getAll();
	EmployeeResponse save(EmployeeRequest request);
	EmployeeResponse update(Long id, EmployeeRequest request);
	EmployeeResponse delete(Long id);
	long countEmployees();
}
