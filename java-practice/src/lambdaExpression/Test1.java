package lambdaExpression;

import java.util.Set;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
//Employee
		Set<Employee> set = new TreeSet<>();
		Employee e1 = new Employee(01,"sana",10000);
		Employee e2 = new Employee(02,"sonu",80000);
		Employee e3 = new Employee(05,"kriti",10000);
		Employee e4 = new Employee(03,"pooja",30000);
		Employee e5 = new Employee(07,"aditi",60000);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		for(Employee e:set) {
			System.out.println(e);
		}
		
	}

}
