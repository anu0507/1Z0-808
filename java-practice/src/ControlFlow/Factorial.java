package ControlFlow;

public class Factorial {
	public static long fact(int n) {
		if (n == 0 || n == 1)
			return 1;
		else {
			long sum = 1;
			for (int i = 1; i <= n; i++) {
				sum = sum * i;

			}
			return sum;

		}

	}

	public static void main(String[] args) {
		long result = Factorial.fact(44);
		System.out.println(result);

	}

}
