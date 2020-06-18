package com.ga.acelerador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.acelerador.model.Licencia;

@Repository
public interface LicenciaRepository extends JpaRepository<Licencia, Long>{

}
