package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NioString {
	public static void main(String[] args) throws IOException {
		// Duplicate Print
		Path path = Paths.get("F:\\Anu\\test.txt");
		Stream<String> lines = Files.lines(path);
		Map<String, Long> collect = lines.collect(Collectors.groupingBy(String::toString, Collectors.counting()));
		//collect.forEach((k,v)->System.out.println(k+" "+v));
		/*Path path2 = Paths.get("F:\\");
		try( Stream<Path> ph = Files.list(path2))*/
		Path path2 = Paths.get("F:\\Notes");
		try( Stream<Path> ph = Files.walk(path2)){
			ph.forEach(System.out::println);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
