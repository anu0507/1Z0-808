package com.mis;

public class LazySingleton {
	// not threadSafe
	private static LazySingleton instance;
	private LazySingleton() {
		
	}
	public static LazySingleton getInstance(){
		if(instance == null) {
			instance  = new LazySingleton();
		}
		return instance;
	}

}
