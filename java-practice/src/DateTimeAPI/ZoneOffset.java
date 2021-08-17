package DateTimeAPI;

import java.time.LocalDate;

public class ZoneOffset {

	private static final ZoneOffset ZoneldOffset = null;

	public static void main(String[] args) {
		/*
		 * get
		 * equals 
		 * toString
		 * hashCode 
		 * compareTo
		 * getLong
		 * getId 
		 * query// return type
		 * of 
		 * range// range of valid values.
		 * isSupported//temporalField supported by this instance.
		 * adjustInto
		 *from
		 *getRules
		 * getTotalSeconds//return total seconds.
		 * ofHours//
		 * ofHoursMinutes
		 * ofHoursMinutesSeconds
		 * ofTotalSeconds
		 * getDisplayName
		 * normalized
		 * getAvailableZonelds
		 * ofOffset 
		 * systemDefault
		 * wait
		 * getClass 
		 * notify 
		 * notifyAll
		 */
		
		ZoneOffset zd = new ZoneOffset();
		int zd1 = ZoneOffset.query();
		System.out.println(zd1);
		zd.get();
		zd.getLong();
		System.out.println(zd);
	}

	public static int query() {
		return 5;
	}

	public void getLong() {
		
	}

	public String  get() {
		return null;
	}

}
