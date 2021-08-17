package MethodAndEncapsulation;

public class ScopeVariable {
	static int a = 10;
	int b = 20;
	static {
		System.out.println(a);
//		System.out.println(b);
		int c = 30;
	}

	static public void m1(int d) {
		System.out.println(a);
		//System.out.println(b);
		// System.out.println(c);
	}

	{
		System.out.println(a);
		System.out.println(b);
		// System.out.println(c);

	}
	 public void m2( int e) {
	// System.out.println(a);
	 System.out.println(b);
	// System.out.println(c);
	  int f = 50;
	 System.out.println(e);
	 System.out.println(f);
//	 private int b = 30;

	// System.out.println("value of b " + b);
	// System.out.println("value of b " + this.b);

	}

	public static void main(String[] args) {
	ScopeVariable scopevariable = new ScopeVariable();	
		//scopevariable.m2(10);
																																																																													

	
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);

	}

	static {
	// System.out.println(a);
	// System.out.println(b);
	// System.out.println(c);

//	}
	{
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);
	}
	}
}

