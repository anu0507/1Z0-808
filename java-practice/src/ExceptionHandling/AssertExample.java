package ExceptionHandling;

public class AssertExample {

	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		if (i < 0) {
			i = -i;
			
		}
		assert(i>=0):" Impossible i Is Negative";
		System.out.println("The Value Of i Is:" + i);
	//assert(i>0):" Impossible i Is Negative";

	}

}
