package com.recode.agenciaVooFeliz.dto;

import com.recode.agenciaVooFeliz.entities.Passagem;

public class PassagemDTO {

	private Long id;
	private String destino;
	private Double Preco;
	private String imagem;
	
	public PassagemDTO() {
		
	}

	public PassagemDTO(Passagem passagem) {
		id = passagem.getId();
		destino = passagem.getDestino();
		Preco = passagem.getPreco();
		imagem = passagem.getImagem();
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
