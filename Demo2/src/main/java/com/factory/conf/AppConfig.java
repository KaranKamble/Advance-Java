package com.factory.conf;
import com.factory.BoxImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Alternate to beans.xml file

@Configuration
public class AppConfig {

	@Bean	
	public BoxImpl b1() {	// Method name = bean id
		BoxImpl b1 = new BoxImpl();
		b1.setLenght(2);
		b1.setBreadth(4);
		b1.setHeight(5);
		return b1;
	}
	
	@Bean
	public BoxImpl b2() {	// Method name = bean id
		BoxImpl b1 = new BoxImpl(4,7,2);
		return b1;
	}
}
