package ControlFlow;

public class EnumTest {

	public static void main(String[] args) {
	String result = WeekDays.MONDAY.getDay();
		System.out.println(result);
		WeekDays[] values = WeekDays.values();
		//System.out.println(WeekDays.MONDAY.valueOf("mon"));
		for (WeekDays days : values) {
			System.out.println(days);

		}
		Month jan = Month.JAN;
		switch (jan) {
		case JAN:
		case FEB:
		default:

		}
		Month[] values2 = Month.values();
		for (Month m : values2) {
			System.out.println(m + " " + m.ordinal());
			// System.out.println(m.valueOf(arg0));
		}
	}

}
