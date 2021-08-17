package com.nio;

import java.io.IOException;

import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

//Path is a (Interface)/(Class).
// introduce in java 7.
public class PathDemo{
	// call all the methods of Path class.
	
	public static void main(String[] args) throws IOException {
		// how can we create an  Object of Path.
		
		//Path path = Paths.get("F:\\Html&css\\HTML1.pdf");
		//System.out.println(path.getFileName());
		//System.out.println(path.getRoot());
		//System.out.println(path.getParent());
		//System.out.println(path.getNameCount());
		//System.out.println(path.getName(1));
		//System.out.println(path.subpath(1,2));
		//System.out.println(path.normalize());
		//System.out.println(path.isAbsolute());
		//System.out.println(path.toAbsolutePath());
		//System.out.println(path.startsWith("F:\\"));
		//System.out.println(path.toUri());
		//System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
		Path path = Paths.get("F:\\Html&css\\HTML1.pdf");
		
		Path path2 = Paths.get("HTML1.pdf");
	System.out.println(path.compareTo(path2));
		System.out.println(path2.compareTo(path));
	System.out.println(path.equals(path2.isAbsolute()));
		System.out.println(path.toAbsolutePath().equals(path2.toAbsolutePath()));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
