package com.recode.agenciaVooFeliz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.agenciaVooFeliz.dto.PassagemDTO;
import com.recode.agenciaVooFeliz.services.PassagemService;

@RestController
@RequestMapping(value = "/passagens")
public class PassagemController {
	
	@Autowired
	private PassagemService service;
	
	@GetMapping
	public Page<PassagemDTO> findAll(Pageable pageable){		
		return service.findAll(pageable);		
	}

	@GetMapping(value ="/{id}")
	public PassagemDTO findById(@PathVariable Long id){		
		return service.findById(id);		
	}
}
