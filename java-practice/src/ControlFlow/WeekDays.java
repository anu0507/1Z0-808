package ControlFlow;

public strictfp enum WeekDays {
	// public String day;
	MONDAY("mon"), TUESDAY("tue"), WEDNESDAY("wed"), THURSDAY("thu"), FRIDAY("fri"), SATURDAY("sat"), SUNDAY("sun");
	private String day;

	WeekDays(String day) {
		this.day = day;

	}

	public String getDay() {
		return day;

	}
	public static void m1(){
		
	}
	//public abstract void m2();//abstract method is not allowed.

}
