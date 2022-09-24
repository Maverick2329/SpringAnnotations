package com.bso.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Annotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		IEmpleado Antonio = ctx.getBean("comercial",IEmpleado.class);
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		ctx.close();
	}

}
