package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;

public class Client {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<>();
		Student s1 = new Student(1, "Anu", 1234);
		Student s2 = new Student(2, "Ambe", 2345);
		Student s3 = new Student(3, "Anjali", 5678);
		Student s4 = new Student(4, "Shail", 6666);
		Student s5 = new Student(5, "Divya", 7777);
		Student s6 = new Student(6, "Ankita", 8888);
		Student s7 = new Student(7, "Akansha", 9999);
		Student s8 = new Student(8, "Anuja", 1111);
		Student s9 = new Student(9, "Shradha", 2222);
		Student s10 = new Student(10, "sanjali", 3333);
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		li.add(s6);
		li.add(s7);
		li.add(s8);
		li.add(s9);
		li.add(s10);
		Iterator<Student> it = li.iterator();
while(it.hasNext()) {
		 System.out.println(it.next());

}
		/**
		 * for(int i = 0;i<li.size();i++) { Student value = li.get(i);
		 * System.out.println(value); }
		 **/
		/**
		 * for(Student a:li) { System.out.println(a);
		 * 
		 * }
		 **/
		/**
		 * int i = 0; while(i<li.size()) { Student value = li.get(i);
		 * System.out.println(value); i++;
		 * 
		 * }
		 **/
		/**
		 * ListIterator<Student> lt = li.listIterator(); while (lt.hasNext()) {
		 * System.out.println(lt.next());
		 * 
		 * }
		 **/
		/**
		 * Enumeration<Student> eit = Collections.enumeration(li); while
		 * (eit.hasMoreElements()) { System.out.println(eit.nextElement());
		 **/
		/**
		 * li.forEach(k->System.out.println(k));
		 **/

//Q1. fetch those Student whose name starts with A??
		/**List<Student> list = new ArrayList<>();
for(Student st:li) {
		 if(st.getName().startsWith("A")) {
		 list.add(st);

}
}
list.forEach(System.out::println);
**/

//Q2. fetch those Student whose sid lies b/w 5 to 8???
		/**List<Student> list1 = new ArrayList<>();
		for(Student s: li) {
			if(s.getSid()>5 && s.getSid()<8) {
				  
				list1.add(s);

			}
		}
		list1.forEach(System.out::println);

//}
  **/
 

//Q3. update  those Students name whose name start with "S" and length must be greater than 5 and update in Java?
/**List<Student> list3 = new ArrayList<>();
for(Student sd: li) {
	if(sd.getName().startsWith("S") && sd.getName().length()>5) {
		sd.setName("Java");
		list3.add(sd);
	}
}
list3.forEach(System.out::println);
**/




	// Q4. update all the Students names first character with upper letter

		List<Student> list4 = new ArrayList<>();
		for(Student std:li) {
			if(std.setName(std.getName().substring(0,1).toUpperCase().concat(std.getName().substring(1))));
			System.out.println(std);
			
		}
}
}
