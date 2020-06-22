package com.ga.acelerador.service.implementation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ga.acelerador.model.Empleado;
import com.ga.acelerador.model.HorasCargadas;
import com.ga.acelerador.repository.HorasCargadasRepository;
import com.ga.acelerador.service.HorasCargadasService;

@Service
public class HorasCargadasServiceImplementation implements HorasCargadasService {

	@Autowired
	private HorasCargadasRepository repository;

	@Override
	public HorasCargadas get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HorasCargadas> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HorasCargadas> getAllByEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HorasCargadas> getAllByEmpleadoEnPeriodo(Empleado empleado, LocalDate desde, LocalDate hasta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HorasCargadas save(HorasCargadas request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HorasCargadas update(Long id, HorasCargadas request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HorasCargadas delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
