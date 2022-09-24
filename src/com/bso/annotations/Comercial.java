package com.bso.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Comercial implements IEmpleado {
	
	@Autowired
	@Qualifier("informeTrim1")
	private ICreacionInforme nuevoInformeTrim1;
	
	@Autowired
	@Qualifier("informeTrim2")
	private ICreacionInforme nuevoInformeTrim2;
	
	@Autowired
	@Qualifier("informeTrim3")
	private ICreacionInforme nuevoInformeTrim3;

	/*@Autowired
	public Comercial(ICreacionInforme nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	
	/*@Autowired
	public void setNuevoInforme(ICreacionInforme nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return this.nuevoInformeTrim1.getInformeFinanciero();
	}

}
