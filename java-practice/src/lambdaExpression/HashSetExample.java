package lambdaExpression;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/**add
remove
clone
clear
contains
isEmpty
iterator
size
spliterator
equals
hashCode
removeAll
toString
toArray
addAll
containsAll
retainAll
stream
removeIf
parallelStream
forEach**/

public class HashSetExample {

	public static void main(String[] args) {
		Set<Integer>set = new TreeSet<>();
		//set.add(null);
		set.add(10);
		set.add(20);
		set.add(60);
		set.add(30);
		set.add(40);
		set.add(50);
		//set.add(null);
		//set.add(null);
	System.out.println(set.size());
	Iterator<Integer> iterator = set.iterator();
	while(iterator.hasNext()) {
		//set.add(60);
		System.out.println(iterator.next());
		
	}
	Set<Integer> synchronizedSet =  Collections.synchronizedSet(set);//this set is thread safe.
		
   
   System.out.println(set.spliterator());
	}

}
