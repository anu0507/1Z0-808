package Inheritance;

public class Cricket extends Sport {
	int players = 11;
	//public void getName()
	public void getName() {
		System.out.println("Cricket");

	}

	protected  int getPlayersCount() {
		return 10;

	}

	public final  Country  getCountry() {
		Country country = new Country();
		country.setName("INDIA");
		return  country;
	}

}
