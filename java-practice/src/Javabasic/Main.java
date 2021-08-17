package Javabasic;
import com.anu.datatype.*;
import  static com.anu.datatype.DataTypeDemo.age;

public class Main {

	public static void main(String[] args) {
		Student.printName();
		int result = Student.rollNo;
		System.out.println(result);
	 // int result1 = com.anu.datatype.DataTypeDemo.age;
		int result1 = age;
		
	System.out.println(result1);
	 // com.anu.datatype.DataTypeDemo demo= new com.anu.datatype. DataTypeDemo();
	DataTypeDemo  demo = new DataTypeDemo();
	 demo.setSalary(1000);
	double salary= demo.getSalary ();
	System.out.println(salary);
	
		
	}

}
