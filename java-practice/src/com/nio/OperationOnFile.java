package com.nio;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class OperationOnFile {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("F:\\Anu\\main.txt");
		// write Operation
		String s = " Anu\n Ambe\n Anjali\n Shail\n Shradha";
		Path write = Files.write(path,s.getBytes());
		System.out.println(write);
		// read Operation
		byte[] readAllBytes = Files.readAllBytes(path);
		System.out.println( new String(readAllBytes));
		List<String> readAllLines = Files.readAllLines(path);
		readAllLines.forEach(System.out::println);
		//copy Files
		Path path1 = Paths.get("F:\\Anu\\test.txt");
		Path copy = Files.copy(path, path1,StandardCopyOption.REPLACE_EXISTING);
		System.out.println(copy);
		// move Files
		Path path2 = Paths.get("F:\\Notes\\test.txt");
		Path move = Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
		System.out.println(move);
		// delete operation
		Path path3 = Paths.get("F:\\Notes\\test.txt");
		Files.delete(path3);
		System.out.println("file deleted");
		
		
		
		
		
		
		
	}

}
