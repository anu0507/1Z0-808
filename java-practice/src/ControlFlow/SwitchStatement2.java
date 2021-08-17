package ControlFlow;

public class SwitchStatement2 {

	public static void main(String[] args) {
		short x = 10;
		final int y = 20;
		 final int z = 25;
		switch (y) {
		case 1: {
			System.out.println("hello");
		}
		case y: {
			System.out.println("anu");
			
		}
		case z: {
			System.out.println("dubey");
		}
		default:
			System.out.println("ambe");

		}
	}

}
