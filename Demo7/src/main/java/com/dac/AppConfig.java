package com.dac;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:demo.properties")
@Configuration
public class AppConfig {

	@ConfigurationProperties(prefix = "p1")
	@Bean
	public Person p1() {
		Person p1 = new Person();
		return p1;
	}
	
	@ConfigurationProperties(prefix = "birth")
	@Bean
	public BirthDate b1() {
		return new BirthDate();
	}

	@Bean
	public Logger fileLogger() {
		FileLoggerImpl l1 = new FileLoggerImpl();
		return l1;
	}

	@Bean
	public Logger consLogger() {
		return new ConsoleLoggerImpl();
	}
}
