package com.recode.agenciaVooFeliz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.agenciaVooFeliz.entities.Compra;
import com.recode.agenciaVooFeliz.entities.CompraPK;

public interface CompraRepository extends JpaRepository<Compra, CompraPK> {

}
