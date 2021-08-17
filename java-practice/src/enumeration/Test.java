package enumeration;

public class Test {

	public static void main(String[] args) {
		// System.out.println("sum");
		for (WeekDay day : WeekDay.values()) {
			// System.out.println(day);
			System.out.println(day.getDay());
		}
		// 1 METHOD
		/*
		 * for(Month month : Month.values()) { System.out.println(month); }
		 */
		// 2 METHOD
		// System.out.println(Month.JAN.toString());
		// System.out.println(Month.valueOf("JAN"));
		// System.out.println(Month.JAN.ordinal());
		System.out.println(Level.HIGH.asLowerCase());
	}

}
