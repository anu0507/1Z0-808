package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ObjectStream {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(101,"Anu");
		map.put(102, "Ambe");
		map.put(103, "Anjali");
		map.put(105, "Shail");
		map.put(106, "Sharadha");
		map.put(107, "Amit");
		try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("object.data"))){
			obj.writeObject(map);
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("object.data"))){
			Map<Integer,String> ro = (Map<Integer,String>)os.readObject();
			ro.forEach((k,v)->System.out.println(k+" "+v));
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
