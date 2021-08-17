package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("ANU");
		al.add(true);
		al.add(10.0);
		for (Object obj : al) {
		//String s = (String) obj;
			//System.out.println(obj);
		}
		ArrayList<Integer> al1 = new ArrayList<>();
//		 ArrayList<String> al2 = new ArrayList<String>();
		al1.add(10);
		//al1.add("anu");
		al1.add(20);
		al1.add(5);
		al1.add(9);
		for(Integer it:al1) {
			int a = it;
			System.out.println(a);
		}
		//List<Number> al3 = new ArrayList<Number>();
		//List<Number> al4 = new ArrayList<Integer>();//CE. polymorphism concept
		//is not applicable on parameter type.
		
		
	}

}
