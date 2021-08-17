package opps.pack2;

import opps.pack1.Animal;

public class Dog extends Animal {
	public String name = "Moti";
	public static int leg = 6;

	public Dog() {
		super("Shradha");
		//this(5);
		//super.name = "Anu";
		//super.getName();
		System.out.println(super.getName());
		super.getSound();
		System.out.println(super.leg);

	}

	public Dog(int age) {
		this("kuku", 7);

	}

	public Dog(String name, int age) {
		System.out.println(this.name);
		
//this(); invalid due to recursive constructor call.
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public static void setLeg(int leg) {
		Dog.leg = leg;
	}

	public static void main(String[] args) {
		Dog d = new Dog();
	}
}
