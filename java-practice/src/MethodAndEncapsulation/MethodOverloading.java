package MethodAndEncapsulation;

public class MethodOverloading {
	int m1(int a) {

		m1("anu");
		System.out.println("statement1 ");
		return a;
	}

	String m1(String name) {

		m1(10, 20);
		System.out.println("statement2 ");
		return "anu";
	}

	int m1(int a, int b) {

		m1(4, 5, 6);
		System.out.println("statement3 ");
		return b;
	}

	void m1(int d, int e, int f) {
		System.out.println("statement4 ");
		m1(100);

		return;
	}

	
	public static void main(String[] args) {
		MethodOverloading l = new MethodOverloading();
		l.m1(10);
		// l.m1("anu");
		// l.m1(20, 30);
		// l.ml(5,4,6);

	}

}
