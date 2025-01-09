package com.dac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo07Application implements CommandLineRunner{

	@Autowired
	private ApplicationContext ctx;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo07Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hey Boot!!");
		
//		Logger l1 = (Logger) ctx.getBean("fileLogger");
//		l1.log("Shyam");
		
		
//		Person p1 = (Person) ctx.getBean("p1");
//		System.out.println(p1);
		
		PersonContact contact = ctx.getBean(PersonContact.class);
		System.out.println(contact);
		
	}

}
