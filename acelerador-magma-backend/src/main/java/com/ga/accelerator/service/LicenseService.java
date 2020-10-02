package com.ga.accelerator.service;

import java.util.List;

import com.ga.accelerator.model.Licence;

public interface LicenseService {

	Licence get(Long id);
	List<Licence> getAll();
	Licence save(Licence request);
	Licence update(Long id, Licence request);
	Licence delete(Long id);
	
}
