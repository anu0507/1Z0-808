package DateTimeAPI;

import java.time.LocalDate;

import java.util.Date;
import java.util.Calendar;

public class Example1 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		Date date = new Date();
		System.out.println(date);
		Calendar calendar  = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar.getTimeZone());
	}

}
