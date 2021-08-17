package Javabasic;

public class Cow {
	String leg;
	String nose;
	String tail;
	String mouth;
	String color;
	String type;

	public String sleeping() {
		return " sleep";
	};

	public String chewing() {
		return " eat";
	};

	public static void main(String[] args) {
		

		Cow cow = new Cow();
		String result = cow.sleeping();
		String result1 = cow.chewing();
		System.out.println(result);
		System.out.println(result1);

}

}
