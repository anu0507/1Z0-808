package Javabasic;

public class Person {
	String name;
	String gender;
	int id;
	float age;
	String qualification;
	String character;

	public String sleep() {
		return " bed";
	};

	public String eat() {
		return " food";
	};

	public String dance() {
		return " hiphop";
	};

	public String sing() {
		return " party song";
	};

	public String play() {
		return " cricket";
	};

	static public void main(String args[]) {
		Person person = new Person();
		String result = person.sleep();
		String result1 = person.eat();
		String result2 = person.dance();
		String result3 = person.sing();
		String result4 = person.play();
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
