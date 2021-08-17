package StarPattern;

public class Pattern {
	public static void printRightAngledTraingle() {
		int rc = 5;
		int sc = 1;

		for (int row = 0; row < rc; row++) {
			for (int i = 0; i < sc; i++) {
				System.out.print("*");

			}
			System.out.println();
			sc++;

		}

	}

	public static void printLeftAngledTraingle() {
		int rc = 5;
		int bs = 4;
		int sc = 1;
		for (int row = 0; row < rc; row++) {
			for (int i = 0; i < bs; i++) {
				System.out.print(" ");
			}
			for (int j = 0; j < sc; j++) {
				System.out.print("*");
			}
			System.out.println();
			bs--;
			sc++;
		}

	}

	public static void printCombinedAngledTraingle() {
		int rc = 5;int bs = 8;int sc = 1;
		for (int row = 0; row < rc; row++) {
			for (int i = 0; i < sc; i++) {
				System.out.print("*");}
			for (int j = 0; j < bs; j++) {
				System.out.print(" ");}
			for (int k = 0; k < sc; k++) {
				System.out.print("*");}
			System.out.println();
			bs = bs-2;
			sc = sc+1;
		}

	}

	public static void printPyramid() {
		int rc = 4;int bs = 3;int sc = 1;
		for (int row = 0; row < rc; row++) {
			for (int i = 0; i < bs; i++) {
				System.out.print(" ");}
			for (int j = 0; j < sc; j++) {
				System.out.print("*");}
			System.out.println();
			bs = bs - 1;
			sc = sc + 2;}
		int rc1 = 3;int bs1 = 2;int sc1 = 3;
		for (int row = 0; row < rc1; row++) {
			for (int i = 0; i < bs1; i++) {
				System.out.print(" ");}
			for (int j = 0; j < sc1; j++) {
				System.out.print("*");}
			System.out.println();

		}

	}

	public static void printReversePyramid() {
		int rc = 4;
		int bs = 0;
		int sc = 7;
		for (int row = 0; row < rc; row++) {
			for (int i = 0; i < bs; i++) {
				System.out.print(" ");
			}
			for (int j = 0; j < sc; j++) {
				System.out.print("*");
			}
			System.out.println();
			bs = bs + 1;
			sc = sc - 2;

		}

	}

	public static void printDaimond() {
		int rc = 4;int bs = 3;int sc = 1;
		for (int row = 0; row < rc; row++) {
			for (int i = 0; i < bs; i++) {
				System.out.print(" ");}
			for (int j = 0; j < sc; j++) {
				System.out.print("*");}
			System.out.println();
			bs = bs - 1;
			sc = sc + 2;
}
		int rc1 = 3;	int bs1 = 1;int sc1 = 5;
		for (int row = 0; row < rc1; row++) {
			for (int i = 0; i < bs1; i++) {
				System.out.print(" ");}
			for (int j = 0; j < sc1; j++) {
				System.out.print("*");}
			System.out.println();
			bs1 = bs1 + 1;
			sc1 = sc1 - 2;
		}

	}

	public static void printInverseRightTraingle() {
		int rc = 5;
		int sc = 5;
		int bs = 0;
		for (int row = 0; row < rc; row++) {
			for (int i = 0; i < sc; i++) {
				System.out.print("*");
			}
			for (int j = 0; j < bs; j++) {
				System.out.print(" ");
			}
			System.out.println();
			sc = sc - 1;
			bs = bs + 1;
		}

	}

	public static void printInverseLeftAngledTraingle() {
		int rc = 5;
		int sc = 5;
		int bs = 0;
		for (int row = 0; row < rc; row++) {
			for (int i = 0; i < bs; i++) {
				System.out.print(" ");
			}
			for (int j = 0; j < sc; j++) {
				System.out.print("*");
			}
			System.out.println();
			sc = sc - 1;
			bs = bs + 1;
		}

	}

	public static void printCombinedIverseRightLeftAngledTraingle() {
		int rc = 5;
		int sc = 5;
		int bs = 0;
		for (int row = 0; row < rc; row++) {
			for (int i = 0; i < sc; i++) {
				System.out.print("*");
			}
			for (int j = 0; j < bs; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < sc; k++) {
				System.out.print("*");
			}

			System.out.println();
			bs = bs + 2;
			sc = sc - 1;
		}

	}

	public static void main(String[] args) {
		// printRightAngledTraingle();
		// printLeftAngledTraingle();
		// printCombinedAngledTraingle();
		//printPyramid();
		// printReversePyramid();
		//printDaimond();
		// printInverseRightTraingle();
		// printInverseLeftAngledTraingle();
		// printCombinedIverseRightLeftAngledTraingle();
		
	}

}
