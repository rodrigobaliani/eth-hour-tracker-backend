package com.ga.accelerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.accelerator.model.Licence;

@Repository
public interface LicenceRepository extends JpaRepository<Licence, Long>{

}
