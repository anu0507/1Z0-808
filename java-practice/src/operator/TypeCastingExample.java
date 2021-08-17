package operator;

public class TypeCastingExample {

	public static void main(String[] args) {
		int a = 160;
		byte b = (byte)a;
		System.out.println(b);
		int c = 0b111;
		int d = 0b001;
		System.out.println(c + d);
		//int e= 135;
		//byte f=(byte)e;
		//System.out.println(f);
		//int g = 58;
		//byte h= (byte)g;
		//System.out.println(h);
		
	}

}

// 0 1 1 1 1 1 1 0
// 0 1 1 0 1 0 1 0
//1 0 1 0 0 0 0 0
//0 1 1 0 0 0 0 0