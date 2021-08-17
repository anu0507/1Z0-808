package ExceptionHandling;

public class ExceptionPipeline {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("An Exception Occurs");
			throw new BookNotFoundException("anu");
		} catch (RuntimeException r) {
			System.out.println("An Exception Is Caught");
			//throw new BookNotFoundException("anu");
			r= new ArithmeticException();
			throw new BookNotFoundException("anu");
		}
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException | NullPointerException e) {
		//	e = new NullPointerException();
			throw new BookNotFoundException("anu");
		}

	}

}
