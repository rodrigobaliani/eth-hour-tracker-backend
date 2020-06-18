package com.ga.acelerador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.acelerador.model.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {

}
