package com.test;

public class ConsoleLoggerImpl implements Logger{

	@Override
	public void log(String msg) {
		System.out.println("ConsoleLoggerImpl");
		
	}

	
}
