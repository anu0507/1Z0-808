package ExceptionHandling;

public class Example4 {
	 static String  s1 = null;

	public static void main(String[] args) {
		try {System.out.println(s1.length());}

		catch(NullPointerException n) {
			System.out.println("no any Exception");
		}
		//catch(NullPointerException n) {
			//System.out.println();
		//}
		finally {
			System.out.println("normal execute program");
		}
		//finally {}
 
	}

}
