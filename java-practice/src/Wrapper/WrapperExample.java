package Wrapper;

public class WrapperExample {
	public static final double PI = 3.14;
	public static final int MIN_VALUE = 0;

	public static void main(String[] args) {
		Integer a = 10;
		Integer a1 = new Integer(10);
		Integer a2 = Integer.valueOf(10);
		Byte b = 20;
		Byte b1 = new Byte((byte) 20);
		Byte b2 = Byte.valueOf((byte) 20);
		Character ch = new Character('1');
		Character ch1 = new Character('d');
		Character ch2 = Character.valueOf('c');
		 Character ch3 = new Character('g');
		// float parseFloat = Float.parseFloat("a");
		// System.out.println(parseFloat);
		String s = "20";
		String s1 = "30";
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s);
		int sum = i + j;
		System.out.println(sum);
		String s3 = "true";
		boolean bl = Boolean.parseBoolean(s3);
		System.out.println(bl);
		// String s4 = "a";
		// Character.parseCharacter(s4);
		String s5 = "1234";
		//byte bt = Byte.parseByte(s5);
		//System.out.println(bt);
		byte bt1 = -128;
		String s6 = "10";
		boolean bn = Boolean.parseBoolean(s6);
		System.out.println(bn);
		

	}

}
