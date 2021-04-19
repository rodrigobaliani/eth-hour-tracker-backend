package com.ga.accelerator.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import org.modelmapper.ModelMapper;

import com.ga.accelerator.dto.request.GlowContractRequest;
import com.ga.accelerator.dto.response.GlowContractResponse;
import com.ga.accelerator.model.GlowContract;
import com.ga.accelerator.repository.GlowContractRepository;
import com.ga.accelerator.service.GlowContractService;

@Service
public class GlowContractServiceImplementation implements GlowContractService {
	
	@Autowired
	private GlowContractRepository repository;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public GlowContractResponse get(Long id) {
		
		GlowContractResponse response = null;
		GlowContract collaborator = repository.findById(id).get();
		response = modelMapper.map(collaborator, GlowContractResponse.class);
		return response;

	}

	@Override
	public List<GlowContractResponse> getAll() {
		
		List<GlowContractResponse> response = new ArrayList<>();
		List<GlowContract> contracts = repository.findAll(Sort.by(Sort.Direction.ASC, "name"));	
		response = contracts.stream()
				.map(contract -> modelMapper.map(contract, GlowContractResponse.class))
				.collect(Collectors.toList());
		return response;
		
	}

	@Override
	public GlowContractResponse save(GlowContractRequest request) {
		
		GlowContractResponse response = null;
		GlowContract contract = modelMapper.map(request, GlowContract.class);
		repository.save(contract);
		response = modelMapper.map(contract, GlowContractResponse.class);
		return response;
	
	}

	@Override
	public GlowContractResponse update(Long id, GlowContractRequest request) {
		
		GlowContractResponse response = null;
		GlowContract contract = this.repository.findById(id).get();
		contract = this.modelMapper.map(request, GlowContract.class);
		contract.setId(id);
		repository.save(contract);
		response = modelMapper.map(contract, GlowContractResponse.class);
		return response;
		
	}

	@Override
	public GlowContractResponse delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
