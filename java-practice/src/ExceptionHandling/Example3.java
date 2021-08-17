package ExceptionHandling;

public class Example3 {
	static String s = null;

	public static void main(String[] args) {
		try {
			System.out.println("anu");
			System.out.println(10 / 0);
			s.length();
		}
		catch (ArithmeticException e) {
			System.out.println("Exception is caught");
			 System.exit(0);
		} catch (Exception e1) {
			System.out.println("kalawati");
		} finally {
			System.out.println("i am in finally block");
		}
	}

}
