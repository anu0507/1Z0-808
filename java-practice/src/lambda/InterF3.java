package lambda;

public interface InterF3 {
	public void m1();
	public  void m2();
	default public void m3() {
		System.out.println("InterF3");
	}
	public static void m4() {
		System.out.println("InterF3 static m4()");
	}
	public static void m5() {
		System.out.println("InterF3 static m5()");
	}
}
