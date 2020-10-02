package com.ga.accelerator.service;

import java.time.LocalDate;
import java.util.List;

import com.ga.accelerator.model.Employee;
import com.ga.accelerator.model.LoadedHours;

public interface LoadedHoursService {
	
	LoadedHours get(Long id);
	List<LoadedHours> getAll();
	List<LoadedHours> getAllByEmployee(Employee employee);
	List<LoadedHours> getAllByEmployeeInPeriod(Employee employee, LocalDate from, LocalDate to);
	LoadedHours save(LoadedHours request);
	LoadedHours update(Long id, LoadedHours request);
	LoadedHours delete(Long id);

}