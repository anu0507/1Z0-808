package lambda;

@FunctionalInterface
public interface InterF {
	public abstract int m1(int a);

	// public abstract int m2();
	default public void m3() {
		System.out.println("Anu");
	}

	public static int m4() {
		return 10;
	}
	public static void main(String[] args) {
		/* ** In interface:
		 * 1. n number default method, n number of static method.
		 * but 
		 * in functional interface : 
		 * 1. only one contains abstract method there is no restriction of static 
		 * and default method.
		 *  
		 *  
		 *  note: object class is not a super class of interface.
		 *  
		*/
		InterF f = null;
		f.toString();
		
		
		
	}

}
