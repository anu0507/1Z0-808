package lambdaExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* add
remove
get
equals
hashCode
indexOf
clear
contains
isEmpty
iterator
lastIndexOf
replaceAll
size
subList
toArray
spliterator
addAll
set
containsAll
listIterator
removeAll
retainAll
sort
stream
removeIf
parallelStream
forEach
	 */

public class ListDemo {
	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		/*
		 * li.add(1, 25); System.out.println(li);
		 */

		//System.out.println(li.addAll(li));
		/*
		 * li.remove(1); System.out.println(li);
		 */

		// System.out.println( li.lastIndexOf(50));

		// System.out.println(li.get(4));
		//System.out.println(li.indexOf(30));
		/*li.set(2, 35);
		System.out.println(li);*/
		/*List<Integer> r = li.subList(0, 2);
		System.out.println(r);*/
		//System.out.println(li.size());
		
		//System.out.println(li.isEmpty());
		//System.out.println(li.hashCode());///

	}

}
