package lambdaExpression;

import java.util.Comparator;

public class EmployeesSort {

	public static Comparator<Employees> sortByemp_id = new Comparator<Employees>() {

		@Override
		public int compare(Employees e1, Employees e2) {
			return e1.getEmp_id() - e2.getEmp_id();

		}

	};
	public static Comparator<Employees> sortByemp_Name = new Comparator<Employees>() {

		@Override
		public int compare(Employees e1, Employees e2) {
			int j = e1.getEmp_name().compareTo(e2.getEmp_name());
			return j;
		}

	};

	public static Comparator<Employees> sortByemp_salary = new Comparator<Employees>() {
		public int compare(Employees e1, Employees e2) {
			int k = (int) (e1.getEmp_salary() - e2.getEmp_salary());
			if (k == 0) {
				int l = e1.getEmp_name().compareTo(e2.getEmp_name());
				if (l == 0) {
					int g =  e1.getEmp_dob().compareTo(e2.getEmp_dob());
					//System.out.println( " *****"+ g);
					return -g;

				}
				return l;

			}

			return k;

		}

	};

}
