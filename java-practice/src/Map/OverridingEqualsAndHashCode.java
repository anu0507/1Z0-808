package Map;
/**Q. why we  need to override EqualsAndHashCode methods?

 * Ans-- In Set or Map ,if we are using Custom Class then we must Override EqualsAndHashCode method 
 * otherwise In Set Duplicate values are allowed or in Map we can put the record but we can not
 * retrieve the record. 
 * SET:
 * CASE:1 if we do not override equals() and hashCode() then  we are allowed to duplicate also.
 * CASE:2 if we override equals() but not hashCode() then we are also allowed to add duplicate records.
 * CASE:3 if we override hashCode() but not equals() then also we are allowed to duplicate also.
 * CASE:4(*****) if we do not override hashCode() properly but equals() override properly then we are also allowed to duplicate records.
 * CASE:5 if we do not override equals() properly but  hasoCode() override properly then we are allowed to duplicate reocrds.
 * CASE: 6 if we override equals() and hashCode () properly then duplicate reords are not allowed.
 * 
 *   
 * 
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

import lambdaExpression.Student;
import lambdaExpression.Student1;

public class OverridingEqualsAndHashCode {

	public static void main(String[] args) {
		Set<Student1> set = new HashSet<>();
		Student1 a1 = new Student1(1, "anu", "dubey");
		Student1 a2 = new Student1(2, "ambe", "kalawati");
		Student1 a3 = new Student1(3, "anjali", "jatav");
		Student1 a4 = new Student1(4, "shail", "mishra");
		Student1 a5 = new Student1(5, "akansha", "parihar");
		Student1 a6 = new Student1(5, "akansha", "parihar");
		Student1 a7 = new Student1(5, "akansha", "parihar");
		set.add(a1);
		set.add(a2);
		set.add(a3);
		set.add(a4);
		set.add(a5);
		set.add(a6);
		set.add(a7);
		 set.forEach(System.out::println); 
		
	
		

	}

}
