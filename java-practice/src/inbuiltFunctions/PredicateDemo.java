package inbuiltFunctions;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// boolean test(T t);
		Predicate<String> pr = (t)->{ return t.startsWith("s");};
     boolean result = pr.test("Ambe");
    // System.out.println(result);
     Predicate<String> pr1 = (t)->{return t.endsWith("a");};
/*boolean result1 = pr1.test("Akansha");
System.out.println(result1);*/
Predicate<String> pr2 = pr.and(pr1);

System.out.println(pr2.test("shanja"));


	}

}
