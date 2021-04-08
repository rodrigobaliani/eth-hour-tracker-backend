package com.ga.accelerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.accelerator.model.GlowContract;

@Repository
public interface GlowContractRepository extends JpaRepository<GlowContract, Long>{

}
