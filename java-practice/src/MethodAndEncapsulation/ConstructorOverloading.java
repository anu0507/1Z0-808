package MethodAndEncapsulation;

public class ConstructorOverloading {
	ConstructorOverloading() {
		this(10);
		// this(10,20);

	}

	ConstructorOverloading(int a) {
		this(10, 20);
		// ConstructorOverloading(10,20);
		System.out.println("one arguments");

	}

	ConstructorOverloading(int a, int b) {
//		 this();

		System.out.println("two arguments");

	}

	void display() {
//		 this();
		new ConstructorOverloading();

	}

	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading();
		 //ConstructorOverloading c1 = new ConstructorOverloading(14);
	}

}
