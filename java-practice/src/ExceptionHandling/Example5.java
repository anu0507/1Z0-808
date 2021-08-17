package ExceptionHandling;

import javax.sound.sampled.Line;

public class Example5 {
	static int[] s = { 10, 20, 30, 40 };

	public static void main(String[] args) {
		System.out.println(s.length);
		try {
			System.out.println(s[5]);
		} catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println("no any error");
		}
		

	}

}
