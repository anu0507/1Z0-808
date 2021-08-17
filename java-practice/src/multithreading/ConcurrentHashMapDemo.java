package multithreading;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/*
 * Q. Difference b/w ConcurrentHashMap and Collections.synchronizedMap()?
 * Q. Difference b/w HashTable and HashMAp?
 * Q. Explain internal working of HashMap? 
 */
public class ConcurrentHashMapDemo {
	

	public static void main(String[] args) {
	Instant now = Instant.now();
	 now = now.truncatedTo(ChronoUnit.MONTHS);
	 System.out.println(now);
	
		
		//ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

	}

}
