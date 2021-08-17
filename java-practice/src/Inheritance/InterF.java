package Inheritance;

public interface InterF {
	public void m();

	default void m2() {
	}

	default int m3() {
		return 0;
	}

	public static void m4() {
	}

	public static void m5() {
	}

}
