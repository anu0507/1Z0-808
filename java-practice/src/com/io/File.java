package com.io;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

public class File {
	public static void main(String[] args) throws IOException {
		//FileReader
		FileReader reader = new FileReader("log.txt");
		int data = reader.read();
		while(data != -1){
		    char dataChar = (char) data;
		    data = reader.read();
		}
		reader.close();
	}
}
