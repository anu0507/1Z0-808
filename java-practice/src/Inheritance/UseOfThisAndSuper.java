package Inheritance;

public class UseOfThisAndSuper {
	int a;
	String name;

	public void m1(int a, String s) {
		this.a = a;
		this.name = s;
		System.out.println(a + " " + name);
		

	}
	 public UseOfThisAndSuper(){
		this.a = 20;
	}
	static {
	//this.a = 20;
		
	}

	public static void main(String[] args) {
		//this.a = 10;

	}

}
