package StringAPI;

public class SubString {

	public static void main(String[] args) {
		String s1 = "anu";
		String s2 = "anu";
System.out.println(s1.equals(s2));
System.out.println(s1.hashCode());
//System.out.println(s2.hashCode());
		s1 = s1.concat(s2);
		s2 = s1.substring(4, 7);
		s1 = s1.substring(0, 4);

		System.out.println(s1);
		System.out.println(s2);
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

}
