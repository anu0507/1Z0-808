package ExceptionHandling;

public class PossibleCombination {
	static String s = null;

	public static void main(String[] args) {
		try {
			System.out.println(s.length());
		} catch (NullPointerException n) {
			System.out.println("sunday");
		}
		System.out.println("--------------");
		try {
			System.out.println(5 / 0);
		} catch (RuntimeException r) {
			System.out.println("correct");
		}
	/*try {5/0}
		catch(ArithmeticException e){
			System.out.println("not zero");
		} 
		finally {}
		finally {}*/

	}

}
