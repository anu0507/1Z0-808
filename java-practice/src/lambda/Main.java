package lambda;

import java.util.ArrayList;
public class Main  implements C,D{
	
	public void methodOne() {
		System.out.println("overriding methodOne");
		C.super.methodOne(); //no any super interface og C
		//C c = new Test();
		//c.methodOne();
	}
	public static void main(String[] args) {
		//C.super.methodOne();
		C  c = new Main();
		//c.methodOne();
		/*ArrayList::new;
		System.out::println();*/
	}
}

interface C{
default void methodOne(){
System.out.println("Interface C default method");

}
}
interface D{
default void methodOne(){
System.out.println("Interface D  default method");
}
}
 

