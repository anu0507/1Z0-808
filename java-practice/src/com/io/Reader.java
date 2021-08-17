package com.io;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
	// step 1: try opening the file with files reader
	public static void main(String[] args) {
		

		try (FileReader fr = new FileReader("log.txt")) {
			int val = 0;
			while((val=fr.read())!=-1) {
				System.out.print((char)val);
				
			}
			

		} catch (FileNotFoundException e) {
			System.out.println("Exception occur while opening the file");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
