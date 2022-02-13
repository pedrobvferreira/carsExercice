package com.ce.app.controller.beans;

import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;

import com.ce.app.controller.services.ViaturaService;
import com.ce.app.model.entities.Viatura;
import java.io.Serializable;

@ViewScoped
@Named("vehicleList")
public class VehicleListControllerBean implements Serializable {
	
	private static final long serialVersionUID = 7190979323682919578L;

	@Autowired
	private ViaturaService viaturaRepository;

	private List<Viatura> lstViaturas;
	
	@Deferred
    @IgnorePostback
	public void loadData() {
		lstViaturas = viaturaRepository.getListViaturas();
	}

	public List<Viatura> getLstViaturas() {
		return lstViaturas;
	}

	public void setLstViaturas(List<Viatura> lstViaturas) {
		this.lstViaturas = lstViaturas;
	}
}
