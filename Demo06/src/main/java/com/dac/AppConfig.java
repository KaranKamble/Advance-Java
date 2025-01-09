package com.dac;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Person p1() {
		PersonImpl p1 = new PersonImpl();
		p1.setName("Ram");
		p1.setEmail("ram@gmail.com");
		p1.setCity("Nagpur");
		return p1;
	}
	
	@Bean
	public Logger fileLogger() {
		FileLoggerImpl fileLogger = new FileLoggerImpl();
		fileLogger.setPathName("log.file");
		return fileLogger;
	}
	
	@Bean
	public Logger consoleLogger() {
		ConsoleLoggerImpl consoleLogger = new ConsoleLoggerImpl();
		return consoleLogger;
	}
	
	@Bean
	public Account a1() {
		AccountImpl a1 = new AccountImpl();
		a1.setId(101);
		a1.setType("Saving");
		a1.setBalance(20000.00d);
		a1.setLogger(fileLogger());	//DI
		a1.setAccHolder(p1());			//DI
		return a1;
	}
}
