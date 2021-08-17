package opps.inheritance;

import java.util.List;

public class A {
	public  void m1(List<String> list){
		System.out.println("String");
		
		
	}
	/*public void display(Object obj) {
		System.out.println("obj");
	}*/
	

}
class C extends A{
	/*public void m1(List<Integer> list){
		System.out.println("Integer");
		
	}*///error due to overloading
	/*public void display(String str) {
		System.out.println("str");
	}*/


}
