package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaExample {

	/*
	 * ()->{}; (int a)->{};
	 * 
	 * (String c, String b)->{};
	 */
	public static void main(String[] args) {
		// public abstract int m1(int a);
		/*
		 * InterF f = (a)->{return 10;}; InterF f = (a)->{return a;};
		 */
		InterF f = (a) -> a;
		int result = f.m1(20);
		System.out.println(result);
		// public abstract int add(int a, int b);
		InterF2 f1 = (a, b) -> {
			return a + b;
		};
		InterF2 f2 = (a, b) -> a + b;
		InterF2 f3 = (a, b) -> {
			int c = a + b;
			return c;
		};
		System.out.println(f2.add(10, 20));
		System.out.println(f3.add(5, 7));
		System.out.println(f1.add(9, 2));
		// public void m1();
		InterF1 f4 = () -> {
			System.out.println("I AM ANU");
		};
		f4.m1();
		// boolean test(T t);
		/* (a)->{if(a%2==0) {return true;}; */
		Predicate<Integer> p = (a) -> a % 2 == 0;
		boolean boo = p.test(20);
		System.out.println(boo);
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		// removeIf(Predicate<? super E>filter);
		Predicate<Integer> p1 = (a) -> {
			return a > 30;
		};
		l.removeIf(p1);
		System.out.println(l);
		//R apply(T,t);
		UnaryOperator<Integer> fun =(a)->{return 5;};
		l.replaceAll(fun);
		System.out.println(l);

	}

}
