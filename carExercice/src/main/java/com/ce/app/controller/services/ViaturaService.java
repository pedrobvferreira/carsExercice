package com.ce.app.controller.services;

import java.util.List;

import com.ce.app.model.entities.Financiamento;
import com.ce.app.model.entities.Mensalidade;
import com.ce.app.model.entities.Viatura;

/**
 * @author pedro.ferreira
 * **/
public interface ViaturaService {
	
	public List<Viatura> getListViaturas();
	
	public List<Mensalidade> getListMensalidades();
	
	public List<Financiamento> getListFinanciamentos();
	
	public Double getPrestacaoMensal(Double valorViatura, String fraccionamento, int mensalidade);
}
