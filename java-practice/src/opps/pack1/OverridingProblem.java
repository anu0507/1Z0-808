package opps.pack1;

public class OverridingProblem {
public static void main(String[] args) {
	A a = new B();
	a.m1();
}
}

class A {
	public A() {
		this.m2();
		m1();
	}

	public void m1() {
		m2();
	}

	public void m2() {
		System.out.println(" parent m2()");
	}
}

class B extends A {
	public B() {

	}

	public void m1() {

	}

	public void m2() {
		System.out.println("child m2()");
	}
}











