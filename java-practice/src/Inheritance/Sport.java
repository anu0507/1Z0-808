package Inheritance;

public class Sport {
	int players = 10;

	public void getName() {
		System.out.println("Football");

	}

	protected int getPlayersCount() {
		return 6;
	}

	public  Object getCountry() {
		return "USA";
	}

}
