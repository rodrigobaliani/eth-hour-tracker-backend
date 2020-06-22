package com.ga.acelerador.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.acelerador.model.Cuenta;
import com.ga.acelerador.repository.CuentaRepository;
import com.ga.acelerador.service.CuentaService;

@Service
public class CuentaServiceImplementation implements CuentaService {
	
	@Autowired
	private CuentaRepository repository;
	
	@Override
	public Cuenta get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cuenta> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cuenta save(Cuenta request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cuenta update(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cuenta delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
