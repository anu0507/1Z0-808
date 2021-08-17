package lambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * add ,remove, equals, hashCode, clear, contains, isEmpty, iterator, size,
 * toArray spliterator, addAll, stream, containsAll, removeAll, removeIf,
 * retainAll parallelStream, forEach
 */
/**Q.1  int [] a1 = {40,30,90,10,80,70,20};
  a.find highest element?
b. find second highest element?
c. find lowest element?
 d. find second element?
 Q2. print no in words????
 **/
public class CollectioExample {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		Collection<Integer> c1 = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> a1 = new ArrayList<>();

		boolean result = c.add(10);
		c.add(20);
		System.out.println(c.add(30));
		c.add(40);
		c1.add(90);
		c1.add(80);
		c1.add(70);
		// boolean addAll(Collection<? extends E> c);
		c.addAll(c1);
		// c.addAll(l1);
		// c.addAll(a1);
		Iterator<Integer> iterator = c.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		System.out.println("*************************");
		c.remove(40);
		c.forEach(System.out::println);
		System.out.println("##############");
		// boolean removeAll(Collection<?> c);
		// c.removeAll(c1);
		c.forEach(System.out::println);
		System.out.println("&&&&&&&&&&&&&&");
		// c.retainAll(c1);
		c.forEach(System.out::println);
		c.size();
		System.out.println(c.size());
		c.size();
		// System.out.println(c.clear());
		/*
		 * c.contains(90); System.out.println(c.contains(90));
		 */
		/*
		 * c.containsAll(c1); System.out.println(c.containsAll(c1));
		 */
		/*
		 * c1.containsAll(c); System.out.println(c1.containsAll(c));
		 */
		//System.out.println(c.isEmpty());
		/**Object[] array = c.toArray();
		Integer []a = {10,20,30,40};
		Integer[] array2 = c.toArray(a);
		System.out.println(array2);*/
		//default boolean removeIf(predicate<? super E> filter);
		// boolean test(T t);
		Predicate<Integer> p=(a)->{return a>30;};
		c.removeIf(p);
		c.forEach(System.out::println);
	}

}
