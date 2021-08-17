package Inheritance;

public class Whizlab {
	Parent p = new Child();
	static Parent p4 = new Child();
	static {
		Parent p5 = new Child();

	}

	public static Parent getObject1() {
		return new Child();

	}

	{
		Parent p1 = new Child();

	}

	public Parent getObject() {
		Parent p2 = new Child();
		return p2;

	}

	public static void main(String[] args) {
		int a = p4.getValue();
		int b = new Child().getValue();
		System.out.println(a+ " " + b);
	}

}
