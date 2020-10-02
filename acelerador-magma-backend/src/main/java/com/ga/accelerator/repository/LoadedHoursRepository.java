package com.ga.accelerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.accelerator.model.LoadedHours;

@Repository
public interface LoadedHoursRepository extends JpaRepository<LoadedHours, Long> {

}
