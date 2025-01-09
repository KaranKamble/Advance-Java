package com.test;

import java.io.File;
import java.io.FileWriter;

public class FileLoggerImpl implements Logger {
	private String pathName;

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	@Override
	public void log(String msg) {
		try (FileWriter out = new FileWriter(new File(pathName))) {
			out.write(msg);
			System.out.println("FileLogger");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
