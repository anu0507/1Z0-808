package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("F:\\Anu//test.txt");

		Path directories = Files.createDirectories(path);
		System.out.println("File created at path" + directories);
		/*Path createFile = Files.createFile(path);
		System.out.println(createFile);// Exception raise (resolve it)*/
		if(Files.isDirectory(path,LinkOption.NOFOLLOW_LINKS )) {
			System.out.println("true");
			
		}else {
			System.out.println("false");
			
		}
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isWritable(path));
		System.out.println(Files.isExecutable(path));
		
	}

}
