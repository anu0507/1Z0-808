package com.mis;

public class ThreadSafeSingleton {
	// threadSafe, by using synchronized.
	private static ThreadSafeSingleton instance;
	private ThreadSafeSingleton() {
		
	}public static  synchronized ThreadSafeSingleton getInstance() {
		if(instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	

}
