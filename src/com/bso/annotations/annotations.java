package com.bso.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.context.xml");
		
		IEmpleado comercial = ctx.getBean("comercial", IEmpleado.class);
		System.out.println(comercial.getTareas());
		System.out.println(comercial.getInforme());
		ctx.close();
	}

}
