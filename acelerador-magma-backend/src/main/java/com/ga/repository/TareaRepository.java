package com.ga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.model.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {

}
