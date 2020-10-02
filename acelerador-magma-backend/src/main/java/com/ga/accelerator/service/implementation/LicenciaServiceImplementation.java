package com.ga.accelerator.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.accelerator.model.Licence;
import com.ga.accelerator.repository.LoadedHoursRepository;
import com.ga.accelerator.service.LicenseService;

@Service
public class LicenciaServiceImplementation implements LicenseService {
	
	@Autowired
	private LoadedHoursRepository repository;

	@Override
	public Licence get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Licence> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Licence save(Licence request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Licence update(Long id, Licence request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Licence delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
