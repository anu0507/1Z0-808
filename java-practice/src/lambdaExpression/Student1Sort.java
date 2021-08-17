package lambdaExpression;
import java.util.Comparator;
public class Student1Sort implements Comparator<Student1>{

	@Override
	public int compare(Student1 s1, Student1 s2) {
	int i = s1.getFirstName().compareTo(s2.getFirstName());
	if(i==0) {
		return s1.getLastName().compareTo(s2.getLastName());
	}
	return i;
	}


}
