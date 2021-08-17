package Map;
//Q how hashMap internally work?

//Q String [] str = {"A","B","A","C","B","A"};
// print duplicate words with 1. count and 2 withoutCount.

import java.util.Arrays;
import java.util.HashMap;

import java.util.Iterator;
/**
remove
get
put
equals
values
hashCode
clear
isEmpty
replace
replaceAll
size
entrySet
putAll
putIfAbsent
forEach
keySet
compute
computeIfAbsent
containsKey
containsValue
getOrDefault
merge
 */
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapExample {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Anjali");
		map.put(2, "Anu");
		map.put(3, "Ambe");
		map.put(4, "Shail");
		map.put(5, "Shradha");
		map.put(5, "Tulsi");
		String s = map.get(2);
		System.out.println(s);
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());

		}
		/*
		 * Set<Integer> keys = map.keySet(); for(Integer key:keys) {
		 * System.out.println(key); }
		 */

		/**
		 * map.remove(5); 
		 * System.out.println(map);
		 **/
		// String s1 =map.put(6, "dubey");
		// System.out.println(s1);

		/***
		 * map.isEmpty();
		 *  System.out.println(map);
		 ***/

		boolean r2 = map.equals(map);
		System.out.println(r2);
		
		String [] str = {"A","B","A","C","B","A"};
		Stream<String> stream = Arrays.stream(str);
		Map<String, Long> collect = stream.collect(Collectors.groupingBy(String::toString,Collectors.counting()));
        collect.forEach((k,v)->System.out.println(k+" "+v));
	}

}
