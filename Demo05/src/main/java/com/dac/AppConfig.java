package com.dac;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Box b1() {
		BoxImpl b1 = new BoxImpl();
		b1.setBreadth(2);
		b1.setHeight(4);
		b1.setLength(4);
		return b1;
	}
	
	@Bean
	public Box b2() {
		BoxImpl b2 = new BoxImpl(2,3,4);
		return b2;
	}
	
	@Bean
	public BoxBeanPostProcessorImpl boxBeanPostProcessorImpl() {
		return new BoxBeanPostProcessorImpl();
	}
}
