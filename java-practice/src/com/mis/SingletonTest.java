package com.mis;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance.hashCode()+" "+ instance1.hashCode()+ " "+instance2.hashCode());

	}

}
