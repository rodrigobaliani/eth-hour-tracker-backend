package com.ga.acelerador.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ga.acelerador.model.Licencia;
import com.ga.acelerador.repository.HorasCargadasRepository;
import com.ga.acelerador.service.LicenciaService;

public class LicenciaServiceImplementation implements LicenciaService {
	
	@Autowired
	private HorasCargadasRepository repository;

	@Override
	public Licencia get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Licencia> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Licencia save(Licencia request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Licencia update(Long id, Licencia request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Licencia delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
