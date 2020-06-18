package com.ga.acelerador.service;

import java.time.LocalDate;
import java.util.List;

import com.ga.acelerador.model.Empleado;
import com.ga.acelerador.model.HorasAsignadas;

public interface HorasAsignadasService {
	
	HorasAsignadas get(Long id);
	List<HorasAsignadas> getAll();
	List<HorasAsignadas> getAllByEmpleado(Empleado empleado);
	List<HorasAsignadas> getAllByEmpleadoEnPeriodo(Empleado empleado, LocalDate desde, LocalDate hasta);
	HorasAsignadas save(HorasAsignadas request);
	HorasAsignadas update(Long id, HorasAsignadas request);
	HorasAsignadas delete(Long id);

}
