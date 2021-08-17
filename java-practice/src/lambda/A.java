package lambda;

public class A implements InterF4 {

	@Override
	public void m2(){

	}

	@Override
	public void m1() {

	}
	public static void main(String[] args) {
		A a = new A();
		a.m3();
		//a.m4();
		InterF4 f = new A();
		f.m3();
		//f.m4();//we can't call static method with reference of that class.
		InterF4.m4();
		InterF3.m5();// static method jo interface me hota h ushko call karne ke liye direct ush class ka naam jishme 
		//sataic define h aur ush method ka naam jishko call karna chahte h ushko likhte h.
		
		
	}

}
