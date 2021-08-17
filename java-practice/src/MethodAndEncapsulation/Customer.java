package MethodAndEncapsulation;

public class Customer {
	private int id;
	private String name;
	private double age;

	public double getAge() {
		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id>0)
			throw new IllegalArgumentException();
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
