package InnerClass;

import InnerClass.Outer.Inner;

public class Test {
	public static void main(String[] args) {
		//how to access inner class members?
		/*
		 * Outer o = new Outer();
		   Outer.Inner i = o.new Inner();
		    i.m1();
		 * 
		 * Outer.Inner i1 = new Outer().new Inner(); i1.m1(); new Outer().new
		 * Inner().m1();
		 */

		// how to access nested inner class members?
		
		 /* Shradha.Shail obj2 = new Shradha.Shail(); obj2.m1(); obj2.m2();*/
		 
		/*new Shradha.Shail().m1();
		new Shradha.Shail().m2();*/
		// how to access  anonymous inner class.
		Anjali ob = new Anjali();
		Anjali a1= new Anjali(){ 
			public int m1() {
				return 300;
			}
		};
		System.out.println(a1.m1());
}
}