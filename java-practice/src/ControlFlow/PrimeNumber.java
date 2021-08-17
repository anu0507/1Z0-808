package ControlFlow;

public class PrimeNumber {
	public static boolean isPrime(int n) {


		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;

		}

		return true;

	}

	public static void main(String[] args) {
		boolean result = PrimeNumber.isPrime(2);
		System.out.println(result);

	}

}
