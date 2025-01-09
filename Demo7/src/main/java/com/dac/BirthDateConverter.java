package com.dac;

import org.springframework.beans.BeansException;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class BirthDateConverter implements Converter<String, BirthDate>, ApplicationContextAware {
	private ApplicationContext ctx;

	@Override
	public BirthDate convert(String source) {
		return (BirthDate) this.ctx.getBean(source);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx = applicationContext;
	}

}
