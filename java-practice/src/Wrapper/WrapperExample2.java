package Wrapper;
import Wrapper.Student;

public class WrapperExample2 {

	public static void main(String[] args) {
		Integer a = Integer.valueOf(128);
		Integer b = Integer.valueOf("128");
		System.out.println(a == b);
		System.out.println(a.hashCode());
		 System.out.println(b.hashCode());

		Float f1 = Float.valueOf(10);
		Float f2 = Float.valueOf(10);
		System.out.println(f1 == f2);
		System.out.println(f1.equals(f2));
		Integer a1 = new Integer(20);
		Integer a2 = new Integer(30);
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		String s1 = "anu";
		String s2 = "anu";
		System.out.println(s1 == s2);
		String s4 = new String("anu");
		String s5 = new String("anu");
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));
		Student st = new Student("anu", 101);
		System.out.println(st);

		int k = a1;
		System.out.println(k);
		int k1 = a1.intValue();
		Character.valueOf('c');
		String s6 = a1.toString();
		System.out.println(s6);
		System.out.println(a1.compareTo(a2));

	}

}
