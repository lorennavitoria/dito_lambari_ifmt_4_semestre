package com.ditolambari._semestre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teste")
public class RotasController { 

	@RequestMapping("/index")
	public String telaIndex() {
		return "index.html";
	}
	
	@RequestMapping("/contato")
	public String telaContato() {
		return "contato.html";
	}
	
	@RequestMapping("/receitas")
	public String telaReceitas() {
		return "receitas.html";
	}
	
	@RequestMapping("/reservas")
	public String telaSobre() {
		return "reservas.html";
	}
}
