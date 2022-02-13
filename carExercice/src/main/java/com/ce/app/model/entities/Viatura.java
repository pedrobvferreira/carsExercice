package com.ce.app.model.entities;

import java.io.Serializable;

/**
 * @author pedro.ferreira
 * **/
public class Viatura implements Serializable {
	
	private static final long serialVersionUID = 90493998575534538L;

	private Long id;
	
	private String nome;
	
	private String cor;
	
	private int numLugares;
	
	private Long idFinanciamento;
	
	private Long idMensalidade;
	
	private Double valorViatura;
	
	private Double prestacaoMensal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getNumLugares() {
		return numLugares;
	}

	public void setNumLugares(int numLugares) {
		this.numLugares = numLugares;
	}

	public Long getIdFinanciamento() {
		return idFinanciamento;
	}

	public void setIdFinanciamento(Long idFinanciamento) {
		this.idFinanciamento = idFinanciamento;
	}

	public Long getIdMensalidade() {
		return idMensalidade;
	}

	public void setIdMensalidade(Long idMensalidade) {
		this.idMensalidade = idMensalidade;
	}
	
	public Double getValorViatura() {
		return valorViatura;
	}

	public void setValorViatura(Double valorViatura) {
		this.valorViatura = valorViatura;
	}
	
	public Double getPrestacaoMensal() {
		return prestacaoMensal;
	}

	public void setPrestacaoMensal(Double prestacaoMensal) {
		this.prestacaoMensal = prestacaoMensal;
	}

}
