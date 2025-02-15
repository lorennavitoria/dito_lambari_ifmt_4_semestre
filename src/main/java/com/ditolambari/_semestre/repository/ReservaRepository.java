package com.ditolambari._semestre.repository;

import java.time.LocalTime;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.ditolambari._semestre.model.Reserva;


@Repository
@EnableJpaRepositories
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

	boolean existsByDataReservaAndHorario(Date dataReserva, LocalTime horario);

}
