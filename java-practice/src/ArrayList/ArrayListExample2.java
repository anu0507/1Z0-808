package ArrayList;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		System.out.println("----trim-------");
		@SuppressWarnings("rawtypes")

		ArrayList arl = new ArrayList();
		arl.add(" anu ");
		arl.add(" dube y ");
		arl.add(20);
		arl.trimToSize();
		System.out.println(arl);
		System.out.println("=====ensureCapacity======");
		ArrayList<String> student = new ArrayList<String>();
		student.add("anu");
		student.add("dubey");
		student.add("ambe");
		student.add("divya");
		student.ensureCapacity(7);
		student.add("anjali");
		for (String s : student) {
			System.out.println(s);
		}
			System.out.println("------isEmpty---------------");
			ArrayList<String> student1 = new ArrayList<String>();
			student1.add("ankita");
			student1.add("prachi");

			System.out.println(student1.isEmpty());// false
			System.out.println(student1.contains("ankita"));// true
			System.out.println(student1.indexOf("prachi"));// 1
			System.out.println(student1.toArray());

		
	}
}
