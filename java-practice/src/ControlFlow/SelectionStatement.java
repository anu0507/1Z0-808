package ControlFlow;

public class SelectionStatement {
	boolean isOdd(int a) {
		
		if (a % 2 != 0)
		
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		SelectionStatement s = new SelectionStatement();
		boolean result = s.isOdd(7);
		System.out.println(result);

	}
}