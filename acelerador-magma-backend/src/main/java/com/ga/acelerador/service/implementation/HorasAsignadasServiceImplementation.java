package com.ga.acelerador.service.implementation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.acelerador.model.Empleado;
import com.ga.acelerador.model.HorasAsignadas;
import com.ga.acelerador.repository.HorasAsignadasRepository;
import com.ga.acelerador.service.HorasAsignadasService;

@Service
public class HorasAsignadasServiceImplementation implements HorasAsignadasService {
	
	@Autowired
	private HorasAsignadasRepository repository;

	@Override
	public HorasAsignadas get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HorasAsignadas> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HorasAsignadas> getAllByEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HorasAsignadas> getAllByEmpleadoEnPeriodo(Empleado empleado, LocalDate desde, LocalDate hasta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HorasAsignadas save(HorasAsignadas request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HorasAsignadas update(Long id, HorasAsignadas request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HorasAsignadas delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
