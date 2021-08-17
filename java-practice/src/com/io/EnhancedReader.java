package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EnhancedReader {

	public static void main(String[] args)  {
		try(BufferedReader br = new BufferedReader(new FileReader("log.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("logNew.txt"))){
			//int val = 0;
			//while(( val = br.read())!=-1)
			String val = null;
			while( (val = br.readLine())!=null){
				//System.out.print((char) val);
				System.out.print( val);
				//bw.write((char)val);
				bw.write(val);
				bw.write("\n");
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
