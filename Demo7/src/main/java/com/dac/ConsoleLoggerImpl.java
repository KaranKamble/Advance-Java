package com.dac;

public class ConsoleLoggerImpl implements Logger {

	public ConsoleLoggerImpl() {
		System.out.println("ConsoleLoggerImpl.ConsoleLoggerImpl()");
	}
	
	@Override
	public void log(String message) {
		System.out.println("ConsoleLoggerImpl.log() by "+message);
	}

}
