package com.ce.app.model.entities;

import java.io.Serializable;

/**
 * @author pedro.ferreira
 * **/
public class Mensalidade implements Serializable {
	
	private static final long serialVersionUID = -8836548266498150291L;
	
	private Long id;
	
	private int valor;
	
	public Mensalidade() {
		
	}
	
	public Mensalidade(Long id, int valor) {
		this.id = id;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
