package lambdaExpression;

public class Employee  implements Comparable{
	private int emp_id;
	private String emp_name;
	private double emp_salary;
	public Employee(int emp_id,String emp_name,double emp_salary) {
		super();
		this.emp_id= emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		int diff = (int)(this.emp_salary - e.emp_salary);
		if(diff==0) {
			return this.emp_name.compareTo(e.emp_name);
		}
		return diff;
	}
	@Override
	public String toString() {
		//return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	 return ""+ emp_id + " "+ emp_name +" "+ emp_salary;
	}

}
