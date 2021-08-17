package operator;

public class IncrementDecrementExample {

	public static void main(String[] args) {

		//int x = 10;
		//System.out.println(++x);
		//int y = 20;
		//System.out.println(y--);
		//int a = 10;
		//a = a++ + a + ++a + a-- + ++a;
		//System.out.println(a);
		int b = 10;
		b = ++b + b++ -b++ + ++b + ++b ;
		System.out.println(b);
	//	System.out.println(++b + b++ -b++ + ++b + b++ );
		
		//System.out.println(b);
		//int c = 11;
		//System.out.println(c+ ++c + c++ - --c + ++c +c);
		//int z = 10;
		//z = z++;
		//System.out.println(z);
		//int r = 9;
		//r = r++ + ++r -r++ +r;
		//System.out.println(r);
		//int q =5;
		//q = q++ + ++q +q -q++ + ++q;
		//System.out.println(q);
		//int y = 30;
		//y = ++y + y++;
		//System.out.println(y);
		//System.out.println(++y + y++);
		int r = 10;
		int g = 20;
		System.out.println(r++);
		System.out.println(++g);
	}

}
