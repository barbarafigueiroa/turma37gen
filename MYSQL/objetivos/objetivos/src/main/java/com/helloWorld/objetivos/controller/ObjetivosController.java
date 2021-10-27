package com.helloWorld.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivos() {
		
		return "Meus objetivos de aprendizagem para esta semana serão: Me manter atenta sobre as explicações e continuar a prática";
	}

}
