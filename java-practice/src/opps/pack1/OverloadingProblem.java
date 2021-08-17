package opps.pack1;

public class OverloadingProblem {
public static void main(String[] args) {
	C c = new D();
	c.show("shradha");
}
}
class C{
	
	public void show(Object obj){
		System.out.println("parent");
	}
}
class D extends C{
	public void show(String obj) {
		System.out.println("child");
	}
}
