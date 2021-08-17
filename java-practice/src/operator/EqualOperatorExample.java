package operator;

public class EqualOperatorExample {

	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		System.out.println(a==b);
		System.out.println(a!=b);
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1==o2);
		String s1 = new String("anu");
		String s2 = new String("anu");
		System.out.println(s1==s2);
		String s3 = s1.intern();
		String s4 = s2.intern();
		System.out.println(s3==s4);
		System.out.println(s1.equals(s2));
		//System.out.println(a.equals(b));

	}

}
