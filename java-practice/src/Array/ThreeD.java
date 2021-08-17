package Array;

public class ThreeD {
	int[][][] a = { { { 10, 20 }, { 30, 40, 50 } }, { { 60, 70, 80 } } };

	public static void main(String[] args) {
		ThreeD th = new ThreeD();

		/**System.out.println(th.a);
		System.out.println(th.a.length);
		System.out.println(th.a[0]);
		System.out.println(th.a[0].length);
		System.out.println(th.a[0][0]);
		System.out.println(th.a[0][0].length);
		//System.out.println(th.a[0][0][0]);**/
		for (int i = 0; i < th.a.length; i++) {
			for (int j = 0; j < th.a[i].length; j++) {
				for (int z = 0; z < th.a[i][j].length; z++) {
					System.out.println(th.a[i][j][z]);
				}

			}

		}

	}

}
