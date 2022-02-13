package com.ce.app.controller.beans;

import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;

import com.ce.app.controller.helper.FileConvertHelper;
import com.ce.app.controller.services.ViaturaService;
import com.ce.app.model.entities.Financiamento;
import com.ce.app.model.entities.Mensalidade;
import com.ce.app.model.entities.Viatura;
import java.io.Serializable;

@ViewScoped
@Named("vehicleController")
public class VehicleControllerBean implements Serializable {
	
	private static final long serialVersionUID = 5872072710132188980L;

	@Autowired
	private ViaturaService viaturaRepository;

	private List<Viatura> lstViaturas;
	
	private List<Mensalidade> lstMensalidades;
	
	private List<Financiamento> lstFinanciamentos;
	
	private Viatura selViatura = null;
	
	private Mensalidade selMensalidade = null;
	
	private Financiamento selFinanciamento = null;
	
	@Deferred
    @IgnorePostback
	public void loadData() {
		lstViaturas = viaturaRepository.getListViaturas();
		lstMensalidades = viaturaRepository.getListMensalidades();
		lstFinanciamentos = viaturaRepository.getListFinanciamentos();
	}

	public List<Viatura> getLstViaturas() {
		return lstViaturas;
	}

	public void setLstViaturas(List<Viatura> lstViaturas) {
		this.lstViaturas = lstViaturas;
	}
	
	public List<Mensalidade> getLstMensalidades() {
		return lstMensalidades;
	}

	public void setLstMensalidades(List<Mensalidade> lstMensalidades) {
		this.lstMensalidades = lstMensalidades;
	}
	
	public List<Financiamento> getLstFinanciamentos() {
		return lstFinanciamentos;
	}

	public void setLstFinanciamentos(List<Financiamento> lstFinanciamentos) {
		this.lstFinanciamentos = lstFinanciamentos;
	}

	public Viatura getSelViatura() {
		return selViatura;
	}

	public void setSelViatura(Viatura selViatura) {
		this.selViatura = selViatura;
	}
	
	public Mensalidade getSelMensalidade() {
		return selMensalidade;
	}

	public void setSelMensalidade(Mensalidade selMensalidade) {
		this.selMensalidade = selMensalidade;
	}

	public Financiamento getSelFinanciamento() {
		return selFinanciamento;
	}

	public void setSelFinanciamento(Financiamento selFinanciamento) {
		this.selFinanciamento = selFinanciamento;
	}
	
	public void createViatura() {
		if (selViatura != null && selFinanciamento != null && selMensalidade != null) {		
			Double prestaccao = viaturaRepository.getPrestacaoMensal(selViatura.getValorViatura(),
					selFinanciamento.getValor(), selMensalidade.getValor());
			
			selViatura.setPrestacaoMensal(prestaccao);
			selViatura.setIdFinanciamento(selFinanciamento.getId());
			selViatura.setIdMensalidade(selMensalidade.getId());
		}
	}
	
	public void saveViatura(Viatura viatura) {
		if(viatura != null) {
			FileConvertHelper.writeFileString("\\Desktop\\car.txt", viatura.getNome() + " " + viatura.getValorViatura() + " " + viatura.getPrestacaoMensal());
		}
	}
}
