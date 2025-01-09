package com.dac;

public class ConsoleLoggerImpl implements Logger {

	public ConsoleLoggerImpl() {
		System.out.println("ConsoleLoggerImpl.ConsoleLoggerImpl() called");
	}
	
	@Override
	public void log(String message) {
		System.out.println(message);
	}

}
