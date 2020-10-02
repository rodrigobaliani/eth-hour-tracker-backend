package com.ga.accelerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.accelerator.model.AssignedHours;

@Repository
public interface AssignedHoursRepository extends JpaRepository<AssignedHours, Long> {

}
