package opps.pack1;

public class PolymorphismProblem {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Grapes grapes = new Grapes();
		Person person = new Person();
		Orange1 orange = new Orange1();
		person.eatFruit(apple);
		person.eatFruit(grapes);
		person.eatFruit(orange);
	}

}

abstract class Fruit {
	abstract void consume();

}

class Apple extends Fruit {

	@Override
	void consume() {
		System.out.println("Consuming Apple");
	}

}

class Grapes extends Fruit {

	@Override
	void consume() {
		System.out.println("Consuming Grapes");
	}

}
class Orange1 extends Fruit{

	@Override
	void consume() {
		System.out.println("Consuming Orange");
	}
	
}

class Person {
	public void eatFruit(Fruit fruit) {
		fruit.consume();

	}
}
