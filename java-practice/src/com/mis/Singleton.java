package com.mis;
/* 1. it is a desiging pattern.
 * 2. only one Object is created in Singleton class.
 * 3. contructor is private in Singleton.
 * 4. Declare a static variable of given class type.
 * 5. Define a static method which return a instance of the given class.
 */

public class Singleton {
	// egar loading
	private static Singleton instance = new Singleton();
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return instance;
		} 

}
