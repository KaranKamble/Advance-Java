package com.dac;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo05Application implements CommandLineRunner{

	@Autowired
	ApplicationContext ctx;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo05Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Spring Bean Life Cycle
		
		System.out.println("Hey Boot!!");
		
		Box b1 = (Box) ctx.getBean("b1");
		System.out.println("Volume of the Box : "+b1.calculateVolume());
		
		Box b2 = (Box) ctx.getBean("b2");
		System.out.println("Volume of the Box : "+b2.calculateVolume());
			
		ArrayList<Integer> list = null;
	}

}
