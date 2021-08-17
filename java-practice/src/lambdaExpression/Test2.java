package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		List<Student1> set = new ArrayList<>();
		Student1 a1 = new Student1(1, "anu", "dubey");
		Student1 a2 = new Student1(2, "ambe", "kalawati");
		Student1 a3 = new Student1(3, "anjali", "jatav");
		Student1 a4 = new Student1(4, "shail", "mishra");
		set.add(a1);
		set.add(a2);
		set.add(a3);
		set.add(a4);
		//Collections.sort(set,Sort.sortBySid); 
		Collections.sort(set,Sort.sortByName); 
		set.forEach(System.out::println);
	}

}
