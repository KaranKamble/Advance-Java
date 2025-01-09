package com.dac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo06Application implements CommandLineRunner{

	@Autowired
	private ApplicationContext ctx;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo06Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Account a1 = (Account) ctx.getBean("a1");
		
		System.out.println("Balance after Deposited : "+a1.deposite(10000.0d));
		
		System.out.println("Balance after Withdrawl : "+a1.withdraw(5000.0d));
		System.out.println(a1);
		
	}

}
