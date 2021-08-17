package lambdaExpression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
	public static void main(String args[]) {
	
	List<Employees> set = new ArrayList<>();
	Employees e1 = new Employees(1, "anu", 10000,LocalDate.of(1999, 03, 07));
	Employees e2 = new Employees(1, "anu", 10000,LocalDate.of(1998, 04, 10));
	Employees e3 = new Employees(2, "ambe", 50000,LocalDate.of(1997, 05, 07));
	Employees e4 = new Employees(2, "ambe", 50000,LocalDate.of(1996, 03, 07));
	Employees e5 = new Employees(3, "anjali",600000,LocalDate.of(1995, 03, 07) );
	Employees e6 = new Employees(4, "shail",4000,LocalDate.of(1994, 03, 07) );
set.add(e1);
set.add(e2);
set.add(e3);
set.add(e4);
set.add(e5);
set.add(e6);
//Collections.sort(set,EmployeesSort.sortByemp_id); 
//Collections.sort(set,EmployeesSort.sortByemp_Name);
Collections.sort(set,EmployeesSort.sortByemp_salary);
set.forEach(System.out::println);
	
	
	}
}
