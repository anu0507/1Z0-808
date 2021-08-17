package ExceptionHandling;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("anu");
		System.out.println("anu");
		System.out.println("anu");
		System.out.println("anu");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		System.out.println("kalawati");
		System.out.println("kalawati");
		System.out.println("kalawati");
		System.out.println("kalawati");
		System.out.println("kalawati");

	}

}
