package Map;

import java.util.Collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/*
 * remove
get
put
values
clone
clear
replace
replace
replaceAll
size
entrySet
putAll
forEach
keySet
containsKey
containsValue
ceilingEntry
ceilingKey
comparator
descendingKeySet
descendingMap
firstEntry
firstKey
floorEntry
floorKey
headMap
headMap
higherEntry
higherKey
lastEntry
lastKey
lowerEntry
lowerKey
navigableKeySet
pollFirstEntry
pollLastEntry
subMap
subMap
tailMap
tailMap
equals
toString
hashCode
isEmpty
wait
wait
wait
getClass
notify
notifyAll
remove
putIfAbsent
compute
computeIfAbsent
computeIfPresent
getOrDefault
merge
57

 */

public class TreeMapExample {
	public static void main(String[] args) {

		TreeMap<Integer, String> tree = new TreeMap();
		tree.put(1, "Anu");
		tree.put(2, "Ambe");
		tree.put(3, "Anjali");
		tree.put(4, "Shail");
		tree.put(5, "Shradha");
		// System.out.println(tree);
		tree.remove(5);
//System.out.println(tree);
		// System.out.println(tree.size());
		boolean empty = tree.isEmpty();
		// System.out.println(empty);//false
		boolean key = tree.containsKey(3);
		// System.out.println(key);
		boolean value = tree.containsValue("Ana");
		// System.out.println(value);
		String string = tree.get(1);
		// System.out.println(string);
		/*
		 * String put = tree.put(3, "Khargosh"); System.out.println(put);
		 * System.out.println(tree);
		 */
		/*
		 * String put = tree.put(6, "AD"); System.out.println(put);
		 */
		// System.out.println(tree.values());
		/*
		 * TreeMap<Integer,String> tree1 = new TreeMap(); tree1.putAll(tree);
		 * System.out.println(tree1);
		 */
		System.out.println(tree.clone());
		// tree.clear();
		// System.out.println(tree);
		// System.out.println(tree.lastKey());
		// System.out.println(tree.keySet());

	}

}

/*
 * @Override public int size() { // TODO Auto-generated method stub return 0; }
 * 
 * @Override public boolean isEmpty() { // TODO Auto-generated method stub
 * return false; }
 * 
 * @Override public boolean containsKey(Object key) { // TODO Auto-generated
 * method stub return false; }
 * 
 * @Override public boolean containsValue(Object value) { // TODO Auto-generated
 * method stub return false; }
 * 
 * @Override public String get(Object key) { // TODO Auto-generated method stub
 * return null; }
 * 
 * @Override public String put(Integer key, String value) { // TODO
 * Auto-generated method stub return null; }
 * 
 * @Override public String remove(Object key) { // TODO Auto-generated method
 * stub return null; }
 * 
 * @Override public void putAll(Map<? extends Integer, ? extends String> m) { //
 * TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void clear() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public Set<Integer> keySet() { // TODO Auto-generated method stub
 * return null; }
 * 
 * @Override public Collection<String> values() { // TODO Auto-generated method
 * stub return null; }
 * 
 * @Override public Set<Entry<Integer, String>> entrySet() { // TODO
 * Auto-generated method stub return null; }
 */