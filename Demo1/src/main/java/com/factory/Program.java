package com.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
	/*	BoxImpl b1 = new BoxImpl();
		b1.setLenght(10);
		b1.setBreadth(8);
		b1.setHeight(12);
		System.out.println("BoxImpl Volume b1 : "+b1.calculateVol());
		
		System.out.println();
		BoxImpl b2 = new BoxImpl(4,7,9);
		System.out.println("BoxImpl Volume b2 : "+b2.calculateVol());
	*/
		
		//Create spring container and application context Obj that in turn communicate with container.
		//For application context configuration is given in form of XML file( in classpath )
		//When application context is created all "Singleton" spring beans are created ( as per configuration )
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		//Get reference of bean Obj from spring container
		BoxImpl b1 = ( BoxImpl )ctx.getBean("b1");
		System.out.println("BoxImpl Volume b1 : "+b1.calculateVol());
		
		BoxImpl b2 = ( BoxImpl )ctx.getBean("b2");
		System.out.println("BoxImpl Volume b2 : "+b2.calculateVol());
		
		
		//Destroy App context, spring container, and all singleton beans in it.
		ctx.close();
	}

}
