package com.helloWorld.mentalidadeHabilidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidadesHabilidades")
public class MentalidadesHabilidadesController {
	
	@GetMapping
	public String mentalidadesHabilidades() {
		return "Minha habilidade mais utilizada nesta atividade foi persistência e Orientação ao futuro. Quanto a habilidade, foi com toda certeza, orientação aos detalhes";
	}

}
