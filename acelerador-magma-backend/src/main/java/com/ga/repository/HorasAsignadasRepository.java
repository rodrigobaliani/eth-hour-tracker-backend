package com.ga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.model.HorasAsignadas;

@Repository
public interface HorasAsignadasRepository extends JpaRepository<HorasAsignadas, Long> {

}
