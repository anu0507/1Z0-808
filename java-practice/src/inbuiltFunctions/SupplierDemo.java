package inbuiltFunctions;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
// T get();
		Random r =  new Random();
		r.nextInt(5);
		;
		Supplier<Integer> sup1 =()->{return r.nextInt(5);};
		//Supplier<Integer> sup =()->{return(int) Math.random();};
	System.out.println(sup1.get());
	}

}
