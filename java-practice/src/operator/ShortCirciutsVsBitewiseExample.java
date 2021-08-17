package operator;

public class ShortCirciutsVsBitewiseExample {

	public static void main(String[] args) {
		int a = 10;
		if (a++ > 15 & ++a < 20) {
			System.out.println(a);
		}
		if (a++ > 15 && ++a < 20) {
			System.out.println(a);
		}
		System.out.println(a);
	}

}
