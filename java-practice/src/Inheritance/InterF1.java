package Inheritance;

public abstract  interface InterF1 {
	int a = 10;
	public  default void m1() {
		System.out.println("default");
		
	}
	public default int m2() {
		return 10;
	}
	public static int m3() {
		return 20;
		
	}
	public static void m4() {}
	
		
		
	
	//static {}
	//{}

}