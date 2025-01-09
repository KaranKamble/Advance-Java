package com.dac;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileLoggerImpl implements Logger {
	private String pathName;
	
	public FileLoggerImpl() {
		System.out.println("FileLoggerImpl.FileLoggerImpl() called");
	}
	
	public void setPathName( String pathname ) {
		System.out.println("FileLoggerImpl.setPathName() called");
		this.pathName = pathname;
	}
	
	@Override
	public void log(String message) {
		try( FileOutputStream stream = new FileOutputStream(pathName, true);
			PrintStream printStream = new PrintStream(stream)){
			printStream.println(message);
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}

	}

}
