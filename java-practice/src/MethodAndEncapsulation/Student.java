package MethodAndEncapsulation;

public class Student {
	int age;
	String name;
	public void modifyName (String name) {
		
	}

	public void modify(int a) {
		a = a + 10;
		System.out.println(a);

	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.age);
		s.modify(s.age);
		System.out.println(s.age);

	}

}
