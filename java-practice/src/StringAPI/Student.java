package StringAPI;

public final class Student {
	private final int rollNumber;
	private final String name;
	private final Address address;

	public Student(int rollNumber, String name, Address address) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;

	};

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return new Address(address.getHouseNumber(), address.getCity(), address.getCountry());
		//return address;
	}

	// public String toString()
	public String toString() {
		return "" + this.rollNumber + " " + this.name + " " + this.address;

	}

}
