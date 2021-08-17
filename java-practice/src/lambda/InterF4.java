package lambda;

public interface InterF4 extends InterF3 {
	public void m1();

	default public void m3() {
		System.out.println("InterF4");
	}
	public static void m4() {
		System.out.println("InterF4 static m4()");
	}

}
