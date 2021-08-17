package lambdaExpression;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/*
 * add
remove
get
clone
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
forEach
set
ensureCapacity
trimToSize
listIterator
removeAll
removeIf
retainAll
sort
equals
hashCode
toString
containsAll
wait
getClass
notify
notifyAll
stream
parallelStream
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> emoji = new ArrayList<>();
		emoji.add("Smiling face");
		emoji.add("Smiling face with heart");
		emoji.add("Smiling face with heart eyes");
		emoji.add("Face with tongue");
		emoji.add("Rolling on the floor laughing");
		/*Iterator<String> it = emoji.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}*/
		// System.out.println(emoji);

		
		 /* emoji.add(0, "Neutral face"); System.out.println(emoji);*/
		 

		// System.out.println(emoji.size());
		
		 /* emoji.remove(0); System.out.println(emoji);*/
		 
		/* emoji.remove("Neutral face");
		 System.out.println(emoji);*/

		//System.out.println(emoji.get(2));
	//	System.out.println(emoji.set(4, null));
		//System.out.println(emoji.containsAll(emoji));
		/*emoji.clear();
		System.out.println(emoji);*/
		/*emoji.toArray();
		System.out.println(emoji);*/
		
		/*System.out.println(emoji.toString());*/
		
		
		
	}

}
