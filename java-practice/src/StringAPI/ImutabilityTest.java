package StringAPI;

public class ImutabilityTest {
	// public void setAddress(Address address)

	public static void main(String[] args) {
		Address address = new Address(25, "Bhopal", "India");

		Student s = new Student(30, "anu", address);

		System.out.println(s.getAddress().getCity());
		Address address1 = s.getAddress();
		address1.setCity("patna");
		System.out.println(s.getAddress().getCity());
	}

}
