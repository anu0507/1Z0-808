
package InnerClass;
// 1.normal inner class
public class Outer {
	public int i = 40;
	public String s = "Ambe";
	public static int j = 70;
	{
		//static int k = 30;// we cannot define static members(static  variable,static block,static method).
		final int k1  =30;
	}

	class Inner {
		/*
		 * inside inner class we cannot define static members,static block,static
		 * variable,static method.
		 * ^ from inner class we can access all the members of outer class directly.
		 */

		private int i = 50;
		private String s1 = "Anjali";

		// private static int k = 90;//
		public void m1() {
			int i = 10;
			System.out.println(i);
			System.out.println(this.i);
			System.out.println(Outer.this.i);
			System.out.println(j);
		}
		// public static void m2() {}
		// static {}

	}

}
