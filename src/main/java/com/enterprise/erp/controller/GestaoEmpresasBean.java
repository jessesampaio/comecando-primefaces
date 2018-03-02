package com.enterprise.erp.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.enterprise.erp.model.Empresa;
import com.enterprise.erp.repository.Empresas;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Empresas empresas;
	
	private List<Empresa> todasEmpresas;

	public void consultar(){
		todasEmpresas = empresas.todas();
	}

	public List<Empresa> getTodasEmpresas() {
		return todasEmpresas;
	}
	
}
