package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo03Application implements CommandLineRunner{

	@Autowired
	private ApplicationContext ctx;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo03Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hey, Boot!!");
		
		BoxImpl b1 = (BoxImpl) ctx.getBean("b1");
		System.out.println("Volume : "+b1.calculateVol());
		
		BoxImpl b2 = (BoxImpl) ctx.getBean("b2");
		System.out.println("Volume : "+b2.calculateVol());
	}

}
