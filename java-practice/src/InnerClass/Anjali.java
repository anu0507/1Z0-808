package InnerClass;

import java.util.Comparator;

// anonymous inner class
public class Anjali {
	public int m1() {
		return 200;
	}

	Ambe ambe = new Ambe() {
		public void m1() {
			System.out.println("m1()");
		}

	};
	Comparator<Integer> comp = new  Comparator() {
	@Override
	public int compare(Object o1, Object O2) {
		return 0;
	}

};
class Ambe {
	

}
}
