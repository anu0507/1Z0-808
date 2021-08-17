package lambdaExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
public static void  main(String args[]) {
	List<Student1> aq = new ArrayList<>();
	Student1 a1 = new Student1(1,"anu","dubey");
	Student1 a2 = new Student1(2,"ambe","kalawati");
	Student1 a3 = new Student1(3,"anjali","jatav");
	Student1 a4 = new Student1(4,"shail","mishra");
	Student1 a5 = new Student1(5,"akansha","parihar");
	aq.add(a1);
	aq.add(a2);
	aq.add(a3);
	aq.add(a4);
	aq.add(a5);
	/**Iterator<Student1> arr = aq.iterator();
	while(arr.hasNext()) {
			 System.out.println(arr.next());
	}**/
	
	List<Student1> aq1 = new ArrayList<>();
	for(Student1 std:aq) {
	
		std.setFirstName(std.getFirstName().substring(0,1).toUpperCase().concat(std.getFirstName().substring(1)));
	std.setLastName(std.getLastName().substring(0,1).toUpperCase().concat(std.getLastName().substring(1)));
	
		System.out.println(std);
	
	
		}
		
	}
	
	
	


}

