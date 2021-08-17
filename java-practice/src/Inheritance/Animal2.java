package Inheritance;

public interface Animal2 {
	public abstract  void eat();
	default void sleep(){
	System.out.println("Can sleep");
	}
	static void run(){
	System.out.println("Can run");
	}

}
