package com.bso.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeTrim3 implements ICreacionInforme {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Reporte de trimestre 3";
	}

}
