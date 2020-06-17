package com.ga.service;

import java.util.List;

import com.ga.model.Cuenta;

public interface CuentaService {
	
	Cuenta get(Long id);
	List<Cuenta> getAll();
	Cuenta save(Cuenta request);
	Cuenta update(Long id);
	Cuenta delete(Long id);
}
