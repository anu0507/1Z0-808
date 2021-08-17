package Map;

import java.util.HashMap;
import java.util.Map;

/* Q1 String []str = {"A","B","A","C","B","A"};
 * a) print duplicate words with count.?
 * b) print duplicate words without count.?
 */
/* Q. 
 * 
 */

public class ArrayQue {

	public static void main(String[] args) {
		String str[] = { "A","B"," A","C","B","A" };

		Map<String, Integer> map = new HashMap<>();
		for (String w : str) {
			if (map.containsKey(w)) {
				int count = map.get(w);
				count = count + 1;
				map.put(w, count);
			} else {
				map.put(w, 1);

			}

		}
		map.forEach((k, v) -> System.out.println(k +" "+ v));

	}

}
