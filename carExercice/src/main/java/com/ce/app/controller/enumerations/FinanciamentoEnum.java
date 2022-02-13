package com.ce.app.controller.enumerations;

/**
 * @author pedro.ferreira
 * **/
public enum FinanciamentoEnum {
	INTERNO("I"),
	EXTERNO("E");

	String valor = null;

	FinanciamentoEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
