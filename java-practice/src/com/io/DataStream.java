package com.io;

import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class DataStream {
	public static void main(String[] args) {
		try(DataOutputStream ds = new DataOutputStream(new FileOutputStream("temp.data"))){
			for(int i = 0;i<10;i++) {
				ds.writeByte(i);
				ds.writeShort(i);
				ds.writeInt(i);
				ds.writeLong(i);
				ds.writeFloat(i);
				ds.writeDouble(i);
				ds.writeChar(i);
			}
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
catch(IOException e) {
	e.printStackTrace();
}
		try(DataInputStream di=  new DataInputStream(new FileInputStream("temp.data") )){
			for(int i = 0; i<10;i++) {
				System.out.printf("%d,%d,%d,%d,%g,%g,%c \n ",di.readByte(),di.readShort(),di.readInt(),di.readLong(),di.readFloat(),di.readDouble(),
						di.readChar());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
