package com.recode.agenciaVooFeliz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.agenciaVooFeliz.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Cliente findByEmail(String email);
	
}
