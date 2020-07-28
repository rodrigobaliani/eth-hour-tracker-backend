package com.ga.acelerador.service;

import java.util.List;

import com.ga.acelerador.model.Empleado;

public interface EmpleadoService {
	
	Empleado get(Long id);
	List<Empleado> getAll();
	Empleado save(Empleado request);
	Empleado update(Long id, Empleado request);
	Empleado delete(Long id);
	long contarEmpleados();
}
