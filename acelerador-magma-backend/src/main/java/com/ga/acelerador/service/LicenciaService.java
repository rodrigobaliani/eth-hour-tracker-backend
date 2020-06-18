package com.ga.acelerador.service;

import java.util.List;

import com.ga.acelerador.model.Licencia;

public interface LicenciaService {

	Licencia get(Long id);
	List<Licencia> getAll();
	Licencia save(Licencia request);
	Licencia update(Long id, Licencia request);
	Licencia delete(Long id);
	
}
