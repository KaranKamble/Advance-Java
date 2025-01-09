package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		AccountService service = (AccountService) ctx.getBean("acc1");
	//	service.getBalance();
		service.deposite(5000.0d);
		service.withdraw(2000.0d);
		System.out.println("Balance : "+service.getBalance());
		
		
		
		
	}
}
