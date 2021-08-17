package Inheritance;

public class Child extends Parent {
	int a = 20;

	Child() {
		
		 int d;
		
		//super(50);
		System.out.println(super.b);
	}

	public void m2() {
		//this();
		int a = 30;
		System.out.println(this.a);
	}

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println(c.getValue());
		c.m2();
	}
}
