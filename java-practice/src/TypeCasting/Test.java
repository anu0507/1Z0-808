package TypeCasting;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		C c = new C();
		c.m1();
		((B) c).m1();
		((A) ((B) c)).m1();
		System.out.println("''''''''''''''''''''''''");
		c.m2();
		((B) c).m2();
		((A) ((B) c)).m2();
		System.out.println("-------------------------");
		System.out.println(c.x);
		System.out.println(((B) c).x);
		System.out.println(((A) ((B) c)).x);
		Object[] a = new Object[2];
		int[] b = new int[4];
		int[][] d = new int[2][3];
		//a = b;
		a = d;
		System.out.println(a==d);
		System.out.println(a[0]);
		Arrays.sort(d);
	}

}
