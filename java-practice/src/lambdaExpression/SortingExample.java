package lambdaExpression;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortingExample {

	public static void main(String[] args) {
		Set<Student> set = new TreeSet<>();
		Student s1 = new Student(30,"Anu",1234);
		Student s2 = new Student(23,"Ambe",12345);
		Student s3 = new Student(25,"Anjali",3456);
		Student s4 = new Student(31,"Shail",34567);
		Student s5 = new Student(3,"Khargosh",45678);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.forEach(System.out::println);
		

	}

}
