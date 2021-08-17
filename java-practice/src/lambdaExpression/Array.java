package lambdaExpression;

import java.util.Arrays;

public class Array {

	public static void main(String args[]) {
		int[] arr = { 40, 30, 90, 10, 80, 70, 20 };

		/**
		 * for (int i = 0; i < arr.length; i++) {
		 * 
		 * System.out.println(arr[i]);
		 * 
		 * } int r1 = arr.length; System.out.println(r1);
		 **/
		Arrays.sort(arr);

		System.out.println(arr[arr.length - 1]);// 90
		System.out.println(arr[arr.length-2]);//80
		System.out.println(arr[0]);// 10

		System.out.println(arr[1]);//20

	}

}
