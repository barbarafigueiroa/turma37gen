package org.generation.processoDois.controller;


import java.util.List;

import org.generation.processoDois.model.CamadaModel;
import org.generation.processoDois.repository.CamadaInterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/processoDois")
@CrossOrigin("*")
public class CamadaController {
	
	@Autowired
	private CamadaInterfaceRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<CamadaModel>> GetAll(){
		return ResponseEntity.ok(repositorio.findAll());
	}

	
}
