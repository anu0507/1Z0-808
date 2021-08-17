package TypeCasting;

public class TypeCastingExample {

	public static void main(String[] args) {
		Base1 b = new Derived2();
		Object o1 = b;
		Object o2 = (Base1) b;
		// Object o3 = (Base2)b;//invalid due to compilation error.
		// Object o4 = (Base2)o2;//invalid due to RuntimeException(ClassCastexception)
		//Base2 b4 = (Base1)(new Derived1());//invalid due to compilation error.

		// Base2 b3 = (Base2)(new Derived1());//invalid due to compilation error.
		Base2 b2 = (Base2) (new Derived3());// valid.
		System.out.println("--------------------------");
		Child c = new Child();
		c.m1();
		c.m2();
		//((Parent)c).m2();//invalid, compilation error(Child Class methods are not visible to Parent Class).
		Parent p = (Parent)c;
		
	}

}
