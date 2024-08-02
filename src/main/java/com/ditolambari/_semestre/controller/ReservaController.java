package com.ditolambari._semestre.controller;

import com.ditolambari._semestre.model.Reserva;
import com.ditolambari._semestre.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    // Get all reservas
    @GetMapping
    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    // Get a reserva by ID
    @GetMapping("/{id}")
    public ResponseEntity<Reserva> getReservaById(@PathVariable Long id) {
        Optional<Reserva> reserva = reservaRepository.findById(id);
        return reserva.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // Create a new reserva
    @PostMapping
    public Reserva createReserva(@RequestBody Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    // Update an existing reserva
    @PutMapping("/{id}")
    public ResponseEntity<Reserva> updateReserva(@PathVariable Long id, @RequestBody Reserva reservaDetails) {
        return reservaRepository.findById(id)
                .map(reserva -> {
                    reserva.setNome(reservaDetails.getNome());
                    reserva.setEmail(reservaDetails.getEmail());
                    reserva.setTelefone(reservaDetails.getTelefone());
                    reserva.setDataReserva(reservaDetails.getDataReserva());
                    Reserva updatedReserva = reservaRepository.save(reserva);
                    return ResponseEntity.ok(updatedReserva);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    
}
