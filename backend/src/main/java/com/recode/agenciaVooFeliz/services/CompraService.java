package com.recode.agenciaVooFeliz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recode.agenciaVooFeliz.dto.CompraDTO;
import com.recode.agenciaVooFeliz.dto.PassagemDTO;
import com.recode.agenciaVooFeliz.entities.Cliente;
import com.recode.agenciaVooFeliz.entities.Compra;
import com.recode.agenciaVooFeliz.entities.Passagem;
import com.recode.agenciaVooFeliz.repositories.ClienteRepository;
import com.recode.agenciaVooFeliz.repositories.CompraRepository;
import com.recode.agenciaVooFeliz.repositories.PassagemRepository;

@Service
public class CompraService {
	
	@Autowired
	private PassagemRepository passagemRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private CompraRepository compraRepository;
	
	@Transactional
	public PassagemDTO saveCompra(CompraDTO dto) {
		
		Cliente cliente = clienteRepository.findByEmail(dto.getEmail());
		if(cliente == null) {
			cliente = new Cliente();
			cliente.setEmail(dto.getEmail());
			cliente = clienteRepository.saveAndFlush(cliente);
		}
		
		Passagem passagem = passagemRepository.findById(dto.getPassagemId()).get();
		
		Compra compra = new Compra();
		compra.setPassagem(passagem);
		compra.setCliente(cliente);
		compra.setQuantidade(dto.getQuantidade());
		
		compra = compraRepository.saveAndFlush(compra);
		
		return new PassagemDTO(passagem);
		
	}

}
