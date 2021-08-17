package com.anu.datatype;

public class Student {
	String name;
	int id;
	float age;
	String qualification;
	String gender;

	public String play() {
		return " basket ball";
	};

	public String study() {
		return " programming";
	};

	public String eating() {
		return "food";
	}

	public String speak() {
		return " hindi";
	}

	public static void main(String[] args) {

		Student student = new Student();
		String result = student.play();
		String result1 = student.study();
		String result2 = student.eating();
		String result3 = student.speak();

		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		student.name = "anu";
		System.out.println(student.name);
	}
}



