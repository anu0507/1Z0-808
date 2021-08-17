package Javabasic;

public class Calculater {
	// define methods add,subtract,multiply,and divide,taking two argument of
	// integer type and returning the evaluated value of integer type
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Calculater calculater = new  Calculater();
		int sum = calculater.add(10,20);
		System.out.println(sum);
		 int sub = calculater.subtract(20,10);
		 System.out.println(sub);
		  int multiply = calculater.multiply(10,20);
		  System.out.println(multiply);
		  int divide = calculater.divide(15,3);
		  System.out.println(divide);
		

	}
}

	
