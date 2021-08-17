package StringAPI;

public class Address {
	private int houseNumber;
	private String city;
	private String country;

	public Address() {
	}

	public Address(int houseNumber, String city, String country) {
		this.houseNumber = houseNumber;
		this.city = city;
		this.country = country;

	}
	

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String toString() {
		return "" + this.houseNumber + " " + this.city + " " + this.country;

	}
}
