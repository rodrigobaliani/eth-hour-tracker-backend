package com.ga.acelerador.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ga.acelerador.dto.request.CollaboratorRequest;
import com.ga.acelerador.dto.response.CollaboratorResponse;
import com.ga.acelerador.model.Empleado;
import com.ga.acelerador.repository.EmpleadoRepository;
import com.ga.acelerador.service.EmpleadoService;
import com.ga.acelerador.dto.response.CollaboratorResponse;


import org.modelmapper.ModelMapper;
@Service
public class EmpleadoServiceImplementation implements EmpleadoService {

	@Autowired
	private EmpleadoRepository repository;
	@Autowired
	private ModelMapper modelMapper;
	
	
	public CollaboratorResponse get(Long id) {
		CollaboratorResponse response = null;
	
			Empleado collaborator = repository.findById(id).get();

			response = modelMapper.map(collaborator, CollaboratorResponse.class);

	System.out.println(response.getNombre());

		return response;

	}


	public List<CollaboratorResponse> getAll() {
		
		List<CollaboratorResponse> response = new ArrayList<>();
		List<Empleado> collaborators = repository.findAll(Sort.by(Sort.Direction.ASC, "nombre"));
		
		response = collaborators.stream()
				.map(collaborator -> modelMapper.map(collaborator, CollaboratorResponse.class))
				.collect(Collectors.toList());
		return response;
	}

	
	public CollaboratorResponse save(CollaboratorRequest request) {
		CollaboratorResponse response = null;

	
			Empleado collaborator = modelMapper.map(request, Empleado.class);

			repository.save(collaborator);

			response = modelMapper.map(collaborator, CollaboratorResponse.class);


		return response;
	}

	
	public CollaboratorResponse update(Long id, CollaboratorRequest request) {
		CollaboratorResponse response = null;

			Empleado collaborator = this.repository.findById(id).get();
			collaborator = this.modelMapper.map(request, Empleado.class);

			repository.save(collaborator);

			response = modelMapper.map(collaborator, CollaboratorResponse.class);
		return response;
	}


	
	public CollaboratorResponse delete(Long id) {
	//CollaboratorResponse response = new CollaboratorResponse();

			Empleado collaborator = repository.findById(id).get();

			//collaborator.setDeleted();

			this.repository.save(collaborator);

			//response = modelMapper.map(collaborator, CollaboratorResponse.class);
		//return response;
			return null;
	}
	
	public long contarEmpleados () {
		return repository.count();
	}
}
