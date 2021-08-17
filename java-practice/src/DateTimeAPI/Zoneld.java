package DateTimeAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Zoneld {

	public static void main(String[] args) {
		/*
		 * equals// it is used to check if time zoneId is equals to another time zoneId.
		 * t0String//
		 * hashCode// returns a value which is a hash code for that object.
		 * getId//
		 * of//
		 * getDisplayName// display name 
		 *** normalized// this method returns a copy of this period with the year and months normalized.
		 * 
		 * from//  
		 * getAvailableZonelds//returns the set of available zone id .
		 * getRules //  gives current standardOffset.
		 * ofOffset//
		 * systemDefaults//return systemDefault time zone.
		 * wait// difference b/t the two values.
		 * getClass// 
		 * notify
		 * notifyAll
		 */
		/*LocalDate today = LocalDate.now();
		System.out.println(today);
		Instant now = Instant.now();
		Instant epochNow = Instant.ofEpochSecond(1000000);
		System.out.println(now);
		System.out.println(epochNow);
		//System.out.println("hashCode:" +today.hashCode());*/
		/*Period period = Period.of(1, 2, 3); // 1 year, 2 months, 3 days
		Period periodTwoMonths = Period.ofMonths(2);
		Period period20142015 = Period.between(LocalDate.of( 2014, Month.JANUARY, 1), LocalDate.of( 2015, Month.JANUARY, 1));
	System.out.println(period);
	System.out.println(periodTwoMonths);
	System.out.println(period20142015);*/
		/*LocalDateTime comingMidnight = LocalDateTime.of(LocalDate.now().plusDays(1),LocalTime.MIDNIGHT);
		LocalDateTime now1 = LocalDateTime.now();
		Duration duration =Duration.between(now1, comingMidnight);
		System.out.println(duration);*/
		/*System.out.println(Duration.of(1, ChronoUnit.MINUTES).getSeconds());//60
		System.out.println(Duration.of(1, ChronoUnit.HOURS).getSeconds());//3600
		System.out.println(Duration.of(1, ChronoUnit.DAYS).getSeconds());//86400*/
		
		

	}

	

	
	

}
