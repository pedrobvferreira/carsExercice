package com.ce.app.model.entities;

import java.io.Serializable;

/**
 * @author pedro.ferreira
 * **/
public class Financiamento implements Serializable {
	
	private static final long serialVersionUID = -4376714632715772560L;

	private Long id;
	
	private String valor;
	
	public Financiamento() {
		
	}
	
	public Financiamento(Long id, String valor) {
		this.id = id;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
