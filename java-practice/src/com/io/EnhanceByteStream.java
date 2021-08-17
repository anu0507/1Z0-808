package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//by using BufferedInputStream concept
public class EnhanceByteStream {

	public static void main(String[] args) {
		try(FileInputStream fn = new FileInputStream("Area.class");
				BufferedInputStream bf = new BufferedInputStream(fn)){
			int val = 0;
			while((val = bf.read())!=-1) {
				System.out.println((char)val);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				{
			
		}

	}

}
