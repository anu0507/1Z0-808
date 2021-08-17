package MethodAndEncapsulation;

public class OverloadingWinding {
	public static void m1(int a) {

		System.out.println("Primitive");
	}

	
	public static void m1(float a) {
		System.out.println("Float type");
	}
	

	//public static void m1(Float a) {
		//System.out.println("Float Class");
	//}

	public static void m1(String name,float... a) {
		System.out.println("var args");
	}

	/*public static void m1(Object a) {
		System.out.println("Object");
	}*/

	public static void main(String[] args) {
		m1(10.0f);

	}

														}
