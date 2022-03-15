package com.recode.agenciaVooFeliz.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_compra")
public class Compra {
	
	@EmbeddedId
	private CompraPK id = new CompraPK();
	
	private Integer quantidade;
	
	public Compra() {
		
	}
	
	public void setPassagem(Passagem passagem) {
		id.setPassagem(passagem);
	}
	
	public void setCliente(Cliente cliente) {
		id.setCliente(cliente);
	}

	public CompraPK getId() {
		return id;
	}

	public void setId(CompraPK id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
