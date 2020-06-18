package com.ga.acelerador.service;

import java.util.List;

import com.ga.acelerador.model.Tarea;

public interface TareaService {
	
	Tarea get(Long id);
	List<Tarea> getAll();
	Tarea save(Tarea request);
	Tarea update(Long id, Tarea request);
	Tarea delete(Long id);

}
