package com.recode.agenciaVooFeliz.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CompraPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "Passagem_id")
	private Passagem passagem;
	
	public CompraPK() {
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Passagem getPassagem() {
		return passagem;
	}

	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}
	
	
	
	
}
