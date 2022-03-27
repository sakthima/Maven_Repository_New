package com.reader.com;

import java.io.IOException;

public class FileReaderManager {
	
	public  FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstanceFR() {
		FileReaderManager reader = new FileReaderManager();
		return reader;
	}
	
	public Configuration_Reader getInstanceCR() throws IOException {
		Configuration_Reader helper = new Configuration_Reader();
		return helper;
	}

	
}
