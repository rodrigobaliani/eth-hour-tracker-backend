package com.ga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.model.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {

}
