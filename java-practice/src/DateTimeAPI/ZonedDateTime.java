package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class ZonedDateTime {

	public static void main(String[] args) {
		/*
		 * get 
		 * equals
		 *  toString
		 *  hashCode
		 *  getLong
		 *  format
		 *  query
		 *  of
		 *  getOffset
		 *  parse
		 *  range
		 *  isSupported
		 *  from
		 *  getDayOfMonth
		 *  getDayOfWeek
		 *  getDayOfYear
		 *  getHours
		 *  getMinute
		 *  getMonth
		 *  getMonthValue
		 *  getNano
		 *  getSecond
		 *  getYear
		 *  getZone
		 *  minus
		 *  minusDays
		 *  minusHours
		 *  minusMinutes
		 *  minusMonths
		 *  minusNanos
		 *  minusSconds
		 *  minusWeeks
		 *  minusYears
		 *  now
		 *  ofInstant
		 *  ofLocal
		 *  ofStrict
		 *  plus
		 *  plusDays
		 *  plusHours
		 *  plusMinutes
		 *  plusMonths
		 *  plusNanos
		 *  plusSeconds
		 *  plusWeeks
		 *  plusYears
		 *  toLocalDate
		 *  toLocalDateTime
		 *  toLocalTime
		 *  toOffsetDateTime
		 *  truncatedTo
		 *  until
		 *  with
		 *  withDayOfMonth
		 *  withDayOfYear
		 *  withEarlierOffsetAtOverlap
		 *  withFixedOffsetZone
		 *  withHours
		 *  withLaterOffsetAtOverlap
		 *  withMinute
		 *  withMonth
		 *  withNano
		 *  withSecond
		 *  withYear
		 *  withZoneSamelnstant
		 *  withZoneSameLocal
		 *  wait
		 *  getClass
		 *  notify
		 *  notifyAll
		 *  compareTo
		 *  toEpochSecond
		 *  getChronology
		 *  isAfter
		 *  isBefore
		 *  isEqual
		 *  toInstant
		 */
		LocalDate ld1 = LocalDate.of(2014, Month.SEPTEMBER, 19);
		System.out.println(ld1);
		LocalDate ld2 = LocalDate.ofEpochDay(1000);
		System.out.println(ld2);
		LocalTime lt1 = LocalTime.of(14, 05);
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("14:05:00");
		System.out.println(lt2);
	}

}
