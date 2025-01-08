package com.factory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.factory.conf.AppConfig;

public class Program {

	public static void main(String[] args) {
		
		//Create spring container and application context to communicate with spring container.
		//the configuration is given in terms of an annotated class @Configuration ( Instead if .xml file )
		//All Singleton beans are created as soon as application context is created
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		//Get reference of bean Obj from spring container
		BoxImpl b1 = ( BoxImpl )ctx.getBean("b1");
		System.out.println("BoxImpl Volume b1 : "+b1.calculateVol());
		
		BoxImpl b2 = ( BoxImpl )ctx.getBean("b2");
		System.out.println("BoxImpl Volume b2 : "+b2.calculateVol());
		
		//Destroy App context, spring container, and all singleton beans in it.
		ctx.close();
	}

}
