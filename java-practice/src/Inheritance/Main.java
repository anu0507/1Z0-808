package Inheritance;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		InterF f = () -> {
			System.out.println("anu");
		};
		f.m();
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Predicate<Integer> predicate = e -> e > 30;
		Predicate<Integer> p = (a) -> {
			return a > 30;
		};
		al.removeIf(e -> e > 30);
		// al.removeIf(e->e>30); // you can also pass code as an argument.
		System.out.println(al);// [10, 20, 30]
	}

}
