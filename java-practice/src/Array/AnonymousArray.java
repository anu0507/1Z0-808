package Array;

public class AnonymousArray {

	public static void main(String[] args) {
		int[] a = new int[] {};
		int[] b = new int[5];
		b[0] = 10;
		b[1] = 20;
		b[2] = 'a';
		// b[3] = 10L;//invalid
		 System.out.println(b[2]);
		InterF[] f = new InterF[3];
		f[0] = new MyClass();
		// f[1] = new String();//invalid because String class is not implemented class
		// of InterF
		int[] h = {10,20,30 };
		int[] v = {10,20};
		System.out.println(b=a);
		int[] d = { 10, 20, 30 };
		char[] ch = { 'a', 'b', 'c' };
		
		int l= 'b';
		System.out.println(l);
		int[][] e = new int[2][2];
		 // d = e;
		int[][] g = new int[3][];
		System.out.println(e);
		System.out.println(g);
		// e = g;
		System.out.println(e);
		// g = e;
		Object[][] obj = new Object[4][];
		System.out.println(obj);
		// obj = e;
		// System.out.println(()obj[0][0]);
		int[][] z = new int[2][2];
		z[0] = new int[4];
		System.out.println(z[0]);
	}

}
