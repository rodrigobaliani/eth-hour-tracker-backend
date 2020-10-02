package com.ga.accelerator.service.implementation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ga.accelerator.model.Employee;
import com.ga.accelerator.model.LoadedHours;
import com.ga.accelerator.repository.LoadedHoursRepository;
import com.ga.accelerator.service.LoadedHoursService;

@Service
public class LoadedHoursServiceImplementation implements LoadedHoursService {

	@Autowired
	private LoadedHoursRepository repository;

	@Override
	public LoadedHours get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoadedHours> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoadedHours> getAllByEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoadedHours> getAllByEmployeeInPeriod(Employee employee, LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoadedHours save(LoadedHours request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoadedHours update(Long id, LoadedHours request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoadedHours delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
