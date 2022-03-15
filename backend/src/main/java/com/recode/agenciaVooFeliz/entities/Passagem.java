package com.recode.agenciaVooFeliz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_passagem")
public class Passagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String destino;
	private Double Preco;
	private String imagem;
	
	public Passagem() {
		
	}

	public Passagem(Long id, String destino, Double preco, String imagem) {
		this.id = id;
		this.destino = destino;
		Preco = preco;
		this.imagem = imagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	
}
