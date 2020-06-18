package com.ga.acelerador.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ga.acelerador.model.Empleado;
import com.ga.acelerador.repository.EmpleadoRepository;
import com.ga.acelerador.service.EmpleadoService;

public class EmpleadoServiceImplementation implements EmpleadoService {

	@Autowired
	private EmpleadoRepository repository;
	
	@Override
	public Empleado get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado save(Empleado request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado update(Long id, Empleado request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
