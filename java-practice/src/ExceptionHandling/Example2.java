package ExceptionHandling;

public class Example2 {
	public void m1() {
		//try {m2();}

		// catch(ArithmeticException e){}
		m2();
		System.out.println("m1");

	}

	public void m2() {
		// try {m3();}
		// catch(ArithmeticException e) {

		// }
		m3();

		System.out.println("m2");

	}

	public void m3() {
		System.out.println("m3");
		System.out.println(10 / 0);

	}

	public static void main(String[] args) {
		Example2 e = new Example2();
	
		try {
			e.m1();
		} catch (ArithmeticException e1) {
	}
	System.out.println("anu");
	}

}
