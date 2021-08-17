package ExceptionHandling;

import java.io.IOException;

public class ThrowsExample {
	public void m1() throws InterruptedException  {
		System.out.println("error");
	m2();
	}
	public void m2() throws InterruptedException{
		m3();
	}
	public void m3() throws InterruptedException {
		System.out.println("anu");
		Thread.sleep(5000);
	}

	public static void main(String[] args) throws InterruptedException  {
		ThrowsExample th = new ThrowsExample();
		System.out.println(th);
		th.m1();
		
		

	}

}
