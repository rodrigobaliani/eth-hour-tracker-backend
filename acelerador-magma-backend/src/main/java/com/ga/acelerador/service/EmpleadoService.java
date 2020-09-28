package com.ga.acelerador.service;

import java.util.List;

import com.ga.acelerador.dto.request.CollaboratorRequest;
import com.ga.acelerador.dto.response.CollaboratorResponse;


public interface EmpleadoService {
	
	CollaboratorResponse get(Long id);
	List<CollaboratorResponse> getAll();
	CollaboratorResponse save(CollaboratorRequest request);
	CollaboratorResponse update(Long id, CollaboratorRequest request);
	CollaboratorResponse delete(Long id);
	long contarEmpleados();
}
