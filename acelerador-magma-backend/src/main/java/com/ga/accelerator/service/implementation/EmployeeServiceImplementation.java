package com.ga.accelerator.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ga.accelerator.dto.request.CollaboratorRequest;
import com.ga.accelerator.dto.response.CollaboratorResponse;
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
	
	
	public CollaboratorResponse get(Long id) {
		CollaboratorResponse response = null;
	
			Employee collaborator = repository.findById(id).get();

			response = modelMapper.map(collaborator, CollaboratorResponse.class);

	System.out.println(response.getName());

		return response;

	}


	public List<CollaboratorResponse> getAll() {
		
		List<CollaboratorResponse> response = new ArrayList<>();
		List<Employee> collaborators = repository.findAll(Sort.by(Sort.Direction.ASC, "name"));
		
		response = collaborators.stream()
				.map(collaborator -> modelMapper.map(collaborator, CollaboratorResponse.class))
				.collect(Collectors.toList());
		return response;
	}

	
	public CollaboratorResponse save(CollaboratorRequest request) {
		CollaboratorResponse response = null;

	
			Employee collaborator = modelMapper.map(request, Employee.class);

			repository.save(collaborator);

			response = modelMapper.map(collaborator, CollaboratorResponse.class);


		return response;
	}

	
	public CollaboratorResponse update(Long id, CollaboratorRequest request) {
		CollaboratorResponse response = null;

			Employee collaborator = this.repository.findById(id).get();
			collaborator = this.modelMapper.map(request, Employee.class);

			repository.save(collaborator);

			response = modelMapper.map(collaborator, CollaboratorResponse.class);
		return response;
	}


	
	public CollaboratorResponse delete(Long id) {
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
