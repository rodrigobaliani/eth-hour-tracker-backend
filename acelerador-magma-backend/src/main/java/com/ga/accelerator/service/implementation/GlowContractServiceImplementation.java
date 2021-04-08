package com.ga.accelerator.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.accelerator.model.GlowContract;
import com.ga.accelerator.repository.GlowContractRepository;
import com.ga.accelerator.service.GlowContractService;

@Service
public class GlowContractServiceImplementation implements GlowContractService {
	
	@Autowired
	private GlowContractRepository repository;
	
	@Override
	public GlowContract get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GlowContract> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GlowContract save(GlowContract request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GlowContract update(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GlowContract delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
