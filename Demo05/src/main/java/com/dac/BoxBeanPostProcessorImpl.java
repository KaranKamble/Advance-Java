package com.dac;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BoxBeanPostProcessorImpl implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if( bean instanceof Box )
		System.out.println(beanName+"BoxImpl.postProcessBeforeInitialization() called");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if( bean instanceof Box )
		System.out.println(beanName+"BoxImpl.postProcessAfterInitialization() called");
		return bean;
	}
}
