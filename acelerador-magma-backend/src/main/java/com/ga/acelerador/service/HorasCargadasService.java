package com.ga.acelerador.service;

import java.time.LocalDate;
import java.util.List;

import com.ga.acelerador.model.Empleado;
import com.ga.acelerador.model.HorasCargadas;

public interface HorasCargadasService {
	
	HorasCargadas get(Long id);
	List<HorasCargadas> getAll();
	List<HorasCargadas> getAllByEmpleado(Empleado empleado);
	List<HorasCargadas> getAllByEmpleadoEnPeriodo(Empleado empleado, LocalDate desde, LocalDate hasta);
	HorasCargadas save(HorasCargadas request);
	HorasCargadas update(Long id, HorasCargadas request);
	HorasCargadas delete(Long id);

}