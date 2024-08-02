package com.ditolambari._semestre.controller;

import com.ditolambari._semestre.model.Contato;
import com.ditolambari._semestre.repository.ContatoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contatos")
public class ContatoController {


	@Autowired
	private ContatoRepository contatoRepository;

    @PostMapping
    public ResponseEntity<Contato> createContato(@RequestBody Contato contato) {
    	
    	Contato contatoSalvo = contatoRepository.save(contato);
        return ResponseEntity.ok(contatoSalvo);
    }
}
