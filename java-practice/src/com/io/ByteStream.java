package com.io;
/* PipedInputStream And PipedOutputStream: these classes a communicate channel on which data
 * can be send and received.PipedOutputStream sends   the data and PipedInputStream
 * receives the data send on the channel.
 * FileInputStream and FileOutputStream:  FileInputStream receives a byte Stream from a file,
 *  FileOutputStream writes a byte stream inti a file.
 *  FilterInpuStream and FilterOutputStream: these filtered Streams are used to add functionalities
 *  to plain Streams.the input of an InputStream can be filtered using FilterInputStream. the output of 
 *  an OutputStream can be filtered using FilterOutputStream.
 *  BufferedInputStream and BufferedOutputStream: BufferedInputStream adds buffering capabilities to an InputStream.
 *  BufferedOutputStream adds buffering capabilities to an OutputStream.
 *  PushbackInputStream: a subclass of filter InputStream, it adds Pushback functionalities to an InputStream.
 *  DataInputStream and DataOutputStream:  DataInputStream  can be used to read java primitive data types from an InputStream.
 *  DataOutputStream can be used to write java primitive data types to an OutputStream.
 */
// Reading a byteStream.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) {
		
	
	try(FileInputStream fs = new FileInputStream("Area.class")){
		int val = 0;
		while((val = fs.read())!=-1) {
			System.out.println((char)val);
		}}
	catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
}


