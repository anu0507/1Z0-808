package Array;

public class ArrayComparision {
	int[][][] a = new int[2][0][0];
	int[][][] b = { { {} }, {} };
	int[][][] d = new int[2][][];

	public static void main(String[] args) {
		ArrayComparision ac = new ArrayComparision();
		System.out.println(ac.a);
		System.out.println(ac.a.length);
		System.out.println(ac.a[0]);
		System.out.println(ac.a[0].length);
		//System.out.println(ac.a[0][0]);
		// System.out.println(ac.a[0][0].length);
		System.out.println("============");
		System.out.println(ac.b);
		System.out.println(ac.b.length);
		System.out.println(ac.b[0]);
		System.out.println(ac.b[0].length);
		System.out.println(ac.b[0][0]);
		System.out.println(ac.d);
		System.out.println(ac.d[0]);

	}

}
