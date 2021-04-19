package com.ga.accelerator.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ga.accelerator.dto.request.EmployeeRequest;
import com.ga.accelerator.dto.response.EmployeeResponse;
import com.ga.accelerator.model.Employee;
import com.ga.accelerator.repository.EmployeeRepository;
import com.ga.accelerator.service.EmployeeService;

import org.modelmapper.ModelMapper;
@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	@Autowired
	private ModelMapper modelMapper;
	
	
	public EmployeeResponse get(Long id) {
		EmployeeResponse response = null;
	
			Employee collaborator = repository.findById(id).get();

			response = modelMapper.map(collaborator, EmployeeResponse.class);

	System.out.println(response.getName());

		return response;

	}


	public List<EmployeeResponse> getAll() {
		
		List<EmployeeResponse> response = new ArrayList<>();
		List<Employee> collaborators = repository.findAll(Sort.by(Sort.Direction.ASC, "name"));
		
		response = collaborators.stream()
				.map(collaborator -> modelMapper.map(collaborator, EmployeeResponse.class))
				.collect(Collectors.toList());
		return response;
	}

	
	public EmployeeResponse save(EmployeeRequest request) {
		EmployeeResponse response = null;

	
			Employee collaborator = modelMapper.map(request, Employee.class);

			repository.save(collaborator);

			response = modelMapper.map(collaborator, EmployeeResponse.class);


		return response;
	}

	
	public EmployeeResponse update(Long id, EmployeeRequest request) {
		EmployeeResponse response = null;

			Employee collaborator = this.repository.findById(id).get();
			collaborator = this.modelMapper.map(request, Employee.class);

			repository.save(collaborator);

			response = modelMapper.map(collaborator, EmployeeResponse.class);
		return response;
	}


	
	public EmployeeResponse delete(Long id) {
	//CollaboratorResponse response = new CollaboratorResponse();

			Employee collaborator = repository.findById(id).get();

			//collaborator.setDeleted();

			this.repository.save(collaborator);

			//response = modelMapper.map(collaborator, CollaboratorResponse.class);
		//return response;
			return null;
	}
	
	public long countEmployees () {
		return repository.count();
	}
}
