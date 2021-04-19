package com.ga.accelerator.service;

import java.util.List;

import com.ga.accelerator.dto.request.GlowContractRequest;
import com.ga.accelerator.dto.response.GlowContractResponse;

public interface GlowContractService {
	
	GlowContractResponse get(Long id);
	List<GlowContractResponse> getAll();
	GlowContractResponse save(GlowContractRequest request);
	GlowContractResponse update(Long id, GlowContractRequest request);
	GlowContractResponse delete(Long id);
}
