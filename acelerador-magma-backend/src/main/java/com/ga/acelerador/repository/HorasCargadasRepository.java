package com.ga.acelerador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.acelerador.model.HorasCargadas;

@Repository
public interface HorasCargadasRepository extends JpaRepository<HorasCargadas, Long> {

}
