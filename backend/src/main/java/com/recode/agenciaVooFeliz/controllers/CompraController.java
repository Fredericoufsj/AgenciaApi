package com.recode.agenciaVooFeliz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.agenciaVooFeliz.dto.CompraDTO;
import com.recode.agenciaVooFeliz.dto.PassagemDTO;
import com.recode.agenciaVooFeliz.services.CompraService;

@RestController
@RequestMapping(value = "/passagens")
public class CompraController {	

	@Autowired
	private CompraService service;
	
	@PutMapping()
	public PassagemDTO saveCompra(@RequestBody CompraDTO dto){		
		PassagemDTO passagemDTO = service.saveCompra(dto);
		return passagemDTO;
	}
	
	
}
