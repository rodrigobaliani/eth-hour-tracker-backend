package com.ga.acelerador.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.acelerador.model.Tarea;
import com.ga.acelerador.repository.TareaRepository;
import com.ga.acelerador.service.TareaService;

@Service
public class TareaServiceImplementation implements TareaService {
	
	@Autowired
	private TareaRepository repository;

	@Override
	public Tarea get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tarea> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tarea save(Tarea request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tarea update(Long id, Tarea request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tarea delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
