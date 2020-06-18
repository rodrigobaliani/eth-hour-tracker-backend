package com.ga.acelerador.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ga.acelerador.model.Proyecto;
import com.ga.acelerador.repository.ProyectoRepository;
import com.ga.acelerador.service.ProyectoService;

public class ProyectoServiceImplementation implements ProyectoService {
	
	@Autowired
	private ProyectoRepository repository;

	@Override
	public Proyecto get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyecto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyecto save(Proyecto request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyecto update(Long id, Proyecto request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proyecto delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
