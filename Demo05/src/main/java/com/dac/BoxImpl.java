package com.dac;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class BoxImpl implements Box, InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware {
	private int length;
	private int breadth;
	private int height;

	private String beanName;
	private ApplicationContext ctx;

	public BoxImpl() {
		System.out.println("BoxImpl.BoxImpl() called");
	}

	public BoxImpl(int length, int breadth, int height) {
		System.out.println("BoxImpl.BoxImpl( int, int, int ) called");
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		System.out.println("BoxImpl.setLenght() called");
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		System.out.println("BoxImpl.setBreadth() called");
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		System.out.println("BoxImpl.setHeight() called");
		this.height = height;
	}

	@Override
	public int calculateVolume() {
		System.out.println(this.beanName + " .BoxImpl.calculateVolume() called");
		return this.length * this.breadth * this.height;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this.beanName + " .BoxImpl.afterPropertiesSet() called");
	}

	// OR

	@PostConstruct
	public void boxInit() { // Can give any name to method
		System.out.println(this.beanName + " .BoxImpl.boxInit() called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this.beanName + " .BoxImpl.destroy() called");
	}

	@PreDestroy
	public void boxDestroy() {
		System.out.println(this.beanName + " .BoxImpl.boxDestroy() called");
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println(this.beanName + ". BoxImpl.setBeanName() called");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx = applicationContext;
		System.out.println(this.beanName + ". BoxImpl.setApplicationContext() called");
	}

}
