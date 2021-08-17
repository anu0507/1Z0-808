package enumeration;

public enum WeekDay {
	//in simple enum, IF WE WANT TO DECLARE CONSTANT THINGS THEN SEMICOLON IS OPTIONAL.
	// SUN,MON,TUE,WED//

	SUN("Sunday"), MON("Monday"), TUE("Tuesday");// in enum class we cannot declare variable and in enum fields
													// semicolon is mandatory.
	private String day;
// enum class constructor must be private.
	private WeekDay(String day) {

		this.day = day;
	}

	public String getDay() {
		return day;
	}
}
