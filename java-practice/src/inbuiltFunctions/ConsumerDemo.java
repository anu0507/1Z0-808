package inbuiltFunctions;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
// void accept(T t);
		Consumer<String> con = (t)->{System.out.println(t);};
	con.accept("anu");
	Consumer<String> con1 = (t)->{System.out.println(t.concat("1208"));};
	Consumer<String> con2 = con.andThen(con1);
	con2.accept("ambe");
	System.out.println(con2);
	}

}
