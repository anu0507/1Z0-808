package opps.pack1;

public class WithoutPolymorphism {
	public static void main(String[] args) {
	
	
	Apple1 apple = new Apple1();
	Grapes1 grapes = new Grapes1();
	Orange orange = new Orange();
	Person1 person = new Person1();
	person.eatApple(apple);
	person.eatGrapes(grapes);
	person.eatOrange(orange);
	
}
}
class Apple1{
	public void consume() {
		System.out.println("Consuming Apple");
	}
}
class Grapes1{
	public void consume() {
		System.out.println("Consuming Grapes");
	}
}
class Orange{
	public void consume() {
		System.out.println("Consuming Orange");
	}
}
class Person1{
	public void eatApple(Apple1 apple) {
		apple.consume();
	}
	public void eatGrapes(Grapes1 grapes) {
		grapes.consume();
	}
	public void eatOrange(Orange orange) {
		orange.consume();
	}
}
