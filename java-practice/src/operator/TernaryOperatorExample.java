package operator;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		int a = 20 > 10 ? 20 : 10;
		System.out.println(a);// 20
		boolean b = 20 > 10 ? true : false;
		System.out.println(b);// true
		//20>10?System.out.println("anu"):System.out.println("bye");
		String s = 20 > 10 ? "anu" : "kalawati";
		System.out.println(s);// anu
		String name = 20 > 10 ? (10 < 5 ? "anu" : "amit") : "kalawati";
		System.out.println(name);// amit
		/** variable = Expression1? Expression2:Expression3
		 * 
		 */
		
	}

}
