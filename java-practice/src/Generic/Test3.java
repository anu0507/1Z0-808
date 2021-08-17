package Generic;
import java.util.ArrayList;

public class Test3 {
	public <T> void methodOne(T t) {
		
		
		
		
	}
	public<T,E> void methodTwo(T t,E e) {
		
	}
	public void methodThree(ArrayList<?> l) {
		l.add(null);
		//l.add(10);
		
		
	}
	public void methodFour(ArrayList<? extends Number> l ) {
		l.add(null);
		//l.add(10);
		
	}
	public void methodFive(ArrayList<? super Runnable> l ) {
		
		
	}
	public static void main(String[] args) {
	Test3  ts = new Test3();
	
	//ts.methodOne(10);
	ts.methodOne("anu");
	ts.methodTwo(10, "anu");
	ts.methodTwo(10, 10);
//	ArrayList<String> al5 = new ArrayList<>();
//	ts.methodThree(al5);
//	ArrayList<Integer> al6 = new ArrayList<>();
//	ts.methodThree(al6);
//	ArrayList<Number> al7 = new ArrayList<>();
//	ts.methodFour(al7);
//	ArrayList<Integer> al8 = new ArrayList<>();
//	ts.methodFour(al8);
//	//ArrayList<String> al9 = new ArrayList<>();
//	//ts.methodFour(al9);
//	ArrayList<Runnable> al11 = new ArrayList<>();
//	ts.methodFive(al11);
//	ArrayList<Object> al12 = new ArrayList<>();
//	ts.methodFive(al12);
	//ArrayList<Thread> al13 = new ArrayList<>();
	//ts.methodFive(al13);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
