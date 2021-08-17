package lambdaExpression;
//Q1.  suppose an Employee Class having fields e_id,ename,e_salary, localDate e_dob:
// a. sort on the basis of given fields.
//b. if you are sorting based on salary,if salary of the two employees
//are same then do the sorting by name and if name is also same then do the sorting by dob.

import java.util.Comparator;

public class Sort {

	public static Comparator<Student1> sortByName = new Comparator<Student1>() {
// Anonnymeous class
		@Override
		public int compare(Student1 s1, Student1 s2) {
			int i = s1.getFirstName().compareTo(s2.getFirstName());
			if (i == 0) {
				return s1.getLastName().compareTo(s2.getLastName());
			}
			return i;
		}

	};
	public static Comparator<Student1> sortBySid = new Comparator<Student1>() {

		@Override
		public int compare(Student1 s1, Student1 s2) {
			return s1.getSid() - s2.getSid();

		}

	};
	 

}
