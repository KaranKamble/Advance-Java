package com.dac;

import java.io.FileOutputStream;
import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Value;

public class FileLoggerImpl implements Logger {
	@Value("${log.filePath}")
	private String logFilePath;

	public FileLoggerImpl() {
	}

	@Override
	public void log(String message) {
		try (FileOutputStream outputStream = new FileOutputStream(logFilePath, true);
				PrintStream stream = new PrintStream(outputStream);) {
			stream.println(message);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
