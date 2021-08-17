package MethodAndEncapsulation;

public class Test {

	public static void swap(Student1 s1, Student1 s2) {
		Student1 temp = s1;
		s1 = s2;
		s2 = temp;
	}

	public static void resetValueOfName(Student1 s1) {
		s1.setName("Anu");
	}

	public static void main(String[] args) {
		// Student1 student1 = new Student1("Kalawati");
		// Student1 student2 = new Student1("Amit");
		// System.out.println(student1.getName() + ":" + student2.getName());// Kalawati
		// : Amit
		// swap(student1, student2);
		// System.out.println(student1.getName() + ":" + student2.getName());// Kalawati
		// : Amit

		Student1 student1 = new Student1("Kalawati");
		System.out.println(student1.getName());// Kalawati
		resetValueOfName(student1);
		System.out.println(student1.getName());// Anu

	}
}