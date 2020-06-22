package com.ga.acelerador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.acelerador.model.HorasAsignadas;

@Repository
public interface HorasAsignadasRepository extends JpaRepository<HorasAsignadas, Long> {

}