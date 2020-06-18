package com.ga.acelerador.service;

import java.util.List;

import com.ga.acelerador.model.Proyecto;

public interface ProyectoService {
	
	Proyecto get(Long id);
	List<Proyecto> getAll();
	Proyecto save(Proyecto request);
	Proyecto update(Long id, Proyecto request);
	Proyecto delete(Long id);

}
