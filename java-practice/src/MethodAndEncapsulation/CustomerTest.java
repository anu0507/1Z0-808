package MethodAndEncapsulation;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c = new Customer();
		//c.age = -10;
		
		c.setAge(-10);
		
		System.out.println(c.getAge());

	}

}
