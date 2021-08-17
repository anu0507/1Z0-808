package Array;

public class ArrayDeclarationInSingleLine {
	int[] a = { 10, 20, 30 };
	int[][] b = { { 4, 5, 6 }, { 7, 8 }, { 9 } };

	public static void main(String[] args) {

		ArrayDeclarationInSingleLine line = new ArrayDeclarationInSingleLine();
		System.out.println(line.a);
		System.out.println(line.a.length);
		// System.out.println(line.a[0]);
		// System.out.println(line.a[1]);
		// System.out.println(line.a[2]);
		for (int i = 0; i < line.a.length; i++) {

			System.out.println(line.a[i]);

		}
	System.out.println(line.b);
		System.out.println(line.b[0]);
		System.out.println(line.b.length);
		System.out.println(line.b[0].length);
		System.out.println(line.b[1].length);
		System.out.println(line.b[2].length);
		// System.out.println(line.b[0][0]);
		//System.out.println(line.b[0][1]);
		// System.out.println(line.b[0][2]);
		// System.out.println(line.b[1][0]);
		// System.out.println(line.b[1][1]);
		// System.out.println(line.b[2][0]);
		for (int row = 0; row < line.b.length; row++) {
			for (int col = 0; col < line.b[row].length; col++) {

				System.out.println(line.b[row][col]);

			}

		}

	}

}
