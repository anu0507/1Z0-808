package com.io;
/* Stream: it is an ordered sequence of data.


 * Types of Stream: 
 * 1. character Stream(text based),
 * {eg. text file,document file,html,xml.}
 * 2. binary Stream(data based like image).
 * {eg. .class file,zip file,images(jpg,png).} 
 * 
 */

/* Q. how to read and write characters from text file?
 * Ans: with the help of Reader and Writer Abstract class.
 * Q. how to read and write bytes(data) from binary files?
 * Ans: with the help of InputStream and OutputStream .
 * NOTE: {UTF-16 represent text file and UTF-8 represent binary file.}
*/

import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class InputOutput {

	public static void main(String[] args) throws IOException {
		
		 /* System.out.println("please Enter a Character");
		  
		  int value = System.in.read();
		   // System.out.println(value);
		  System.out.println((char)value);*/
		 
		
		 /* System.out.println("Pleasse Enter a Sentence");
		  BufferedReader br = new
		  BufferedReader(new InputStreamReader(System.in)); 
		  String readLine =
		  br.readLine(); System.out.println(readLine);*/
		 
		PrintStream ps = new PrintStream("log.txt");
		System.setOut(ps);
		System.out.println(" i am Anu, i have enrolled in java course");
	}

}
