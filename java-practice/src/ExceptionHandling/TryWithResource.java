package ExceptionHandling;

import java.util.*;

public class TryWithResource {

	public static void main(String[] args) {
		System.out.println("Please Enter Your Name");
//		Scanner sc = new Scanner(System.in);
//		try {
//			String name = sc.next();
//			System.out.println("Your name is:" + name);
//		} finally {
//			sc.close();
//		}

		try(Scanner sc = new Scanner(System.in);){
		String name = 	sc.next();
		System.out.println("Your Name Is:" + name);
		}
		catch(Exception e) {
			System.out.println("An Exception Occurs");
		}
	}

}
