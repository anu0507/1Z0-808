package Array;

public class ArrayInitialization {

	public static void main(String[] args) {

		String[] a = new String[3];
		System.out.println(a);
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
		// 2D
		int[][] b = new int[2][2];
		System.out.println(b);
		System.out.println(b[0] + " " + b[1]);
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[1][0]);
		System.out.println(b[1][1]);
		System.out.println("===================================");
		
		int[][] c = new int[2][];
		System.out.println(c);
		System.out.println(c[0]);
		System.out.println(c[1]);
		// System.out.println(c[0][0]);
		System.out.println("---------------------");
		
		int[][][] d = new int[2][3][2];
		System.out.println(d);
		System.out.println(d[0]);
		System.out.println(d[0][0]);
		System.out.println(d[0][0][0]);
		System.out.println(";;;;;;;;;;;;;;;;");
		
		int[][][] e = new int[2][][];
		System.out.println(e);
		System.out.println(e[0]);
		System.out.println(e[1]);
		//System.out.println(e[0][0]);
		//System.out.println(e[0][1] + " " + e[0][2] + " " + e[1][0] + " " + e[1][1] + " " + e[1][2]);
		//System.out.println(e[0][0][0]);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
