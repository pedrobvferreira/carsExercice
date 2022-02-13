package com.ce.app.controller.services;

import java.util.ArrayList;
import java.util.List;

import com.ce.app.controller.enumerations.FinanciamentoEnum;
import com.ce.app.model.entities.Financiamento;
import com.ce.app.model.entities.Mensalidade;
import com.ce.app.model.entities.Viatura;

/**
 * @author pedro.ferreira
 * **/
public class ViaturaServiceImpl implements ViaturaService {
	
	@Override
	public List<Viatura> getListViaturas() {
		List<Viatura> lstViaturas = new ArrayList<>();
		
		Viatura viatura1 = new Viatura();
		viatura1.setId(1L);
		viatura1.setNome("Toyota AYGO");
		viatura1.setCor("Cinza");
		viatura1.setValorViatura(14580.00);
		lstViaturas.add(viatura1);
		
		Viatura viatura2 = new Viatura();
		viatura1.setId(2L);
		viatura2.setNome("Toyota COROLLA ACTIVE");
		viatura1.setCor("Vermelho");
		viatura2.setValorViatura(19490.00);
		lstViaturas.add(viatura2);
		
		Viatura viatura3 = new Viatura();
		viatura1.setId(3L);
		viatura3.setNome("Renault Clio");
		viatura1.setCor("Preto");
		viatura3.setValorViatura(20300.00);
		lstViaturas.add(viatura3);

		Viatura viatura4 = new Viatura();
		viatura1.setId(4L);
		viatura4.setNome("Mercedes Benz");
		viatura1.setCor("Cinza");
		viatura4.setValorViatura(72300.00);
		lstViaturas.add(viatura4);
		
		return lstViaturas;
	}

	@Override
	public List<Mensalidade> getListMensalidades() {
		List<Mensalidade> lstMensalidades = new ArrayList<>();
		lstMensalidades.add(new Mensalidade(1L, 12));
		lstMensalidades.add(new Mensalidade(2L, 24));
		lstMensalidades.add(new Mensalidade(3L, 36));
		lstMensalidades.add(new Mensalidade(4L, 48));
		lstMensalidades.add(new Mensalidade(5L, 60));
		return lstMensalidades;
	}

	@Override
	public List<Financiamento> getListFinanciamentos() {
		List<Financiamento> lstFinanciamentos = new ArrayList<>();
		lstFinanciamentos.add(new Financiamento(1L, FinanciamentoEnum.INTERNO.getValor()));
		lstFinanciamentos.add(new Financiamento(2L, FinanciamentoEnum.EXTERNO.getValor()));
		return lstFinanciamentos;
	}
	
	@Override
	public Double getPrestacaoMensal(Double valorViatura, String fraccionamento, int mensalidade) {
		return (valorViatura * calcularFator(fraccionamento)) / mensalidade ;
	}
	
	private Double calcularFator(String selFracionamento) {
		Double fator = 0D;
		if(FinanciamentoEnum.INTERNO.getValor().equals(selFracionamento)) {
			fator = 0.04D;
		} else if(FinanciamentoEnum.EXTERNO.getValor().equals(selFracionamento)) {
			fator = 0.065D;
		}
		return fator;
	}
}
