package operator;

public class BitewiseOperatorExample {

	public static void main(String[] args) {
		System.out.println(true & true);
		System.out.println(false & false);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println("-----------------------------");
		System.out.println(true | true);
		System.out.println(false | false);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println("=============================");
		System.out.println(true ^ true);
		System.out.println(false ^ false);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		
		System.out.println("AND--------");
		System.out.println(4&5);//4
		System.out.println(6&7);//6
		System.out.println(7&8);//0
		
		System.out.println("OR-----");

		System.out.println(4|5);//5
		System.out.println(6|7);//7
		System.out.println(7|8);//15
		
		System.out.println("X-OR====");

		System.out.println(4^5);//1
		System.out.println(6^7);//1
		System.out.println(7^8);//15
		
	}

}
