package ArrayList;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListExample4 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(31);
		al.add(23);
		al.add(11);
		al.add(10);
		al.add(2);
		//boolean test(T t);
		Predicate<Integer> p =(Integer i)->{
			return i%2==0;
		};
		Predicate<Integer> p1 = (i)->{
			return i%2==0;
		};
		Predicate<Integer> p2 = i->{
			return i%2==0;
		};
		Predicate<Integer> p3 = i-> i%2==0;
		
		al.removeIf(i-> i%2==0);
		System.out.println(al);
		

	}

}
