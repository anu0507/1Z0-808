package Javabasic;

public class ExecutionExample {
	int a = m1();
	int b;
	static {
		System.out.println("static block 1 ");
	}
	static int c = m2();
	static int d;

	public ExecutionExample() {
		System.out.println("constructor");
	}

	static {
		System.out.println("static block 2 " + c);
	}
	{
		System.out.println("instance block one " + b);
	}

	public int m1() {
		System.out.println("m1() " + a);
		return 10;
	}

	static public int m2() {
		System.out.println("m2() " + c);
		return 20;
	}

	public static void main(String[] args) {
		ExecutionExample executionExample = new ExecutionExample();

	}

	static {
		System.out.println("static block 3 " + d);
	}
	{
		System.out.println("instance block two " + a);
	}
}
