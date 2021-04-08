package com.ga.accelerator.service;

import java.util.List;

import com.ga.accelerator.model.GlowContract;

public interface GlowContractService {
	
	GlowContract get(Long id);
	List<GlowContract> getAll();
	GlowContract save(GlowContract request);
	GlowContract update(Long id);
	GlowContract delete(Long id);
}
