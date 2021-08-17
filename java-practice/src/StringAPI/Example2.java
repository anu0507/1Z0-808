package StringAPI;

import Wrapper.Student;

public class Example2 {
	// public int indexOf(int);
//	  public int lastIndexOf(int);
//	  public java.lang.String substring(int);
//	   public java.lang.String concat(java.lang.String);
//	  public java.lang.String replace(char, char);
//	  public boolean matches(java.lang.String);
//	  public boolean contains(java.lang.CharSequence);
//	   public java.lang.String replace(java.lang.CharSequence, java.lang.CharSequence);///////
//	     public java.lang.String[] split(java.lang.String);//////////////
//		  public static java.lang.String join(java.lang.CharSequence, java.lang.CharSequence...);//1.8
//		  public java.lang.String toLowerCase();
//		  public java.lang.String toUpperCase();
//		  public java.lang.String trim();
//	  public java.lang.String toString();
//	  public char[] toCharArray();
//	   public static java.lang.String format(java.lang.String, java.lang.Object...);
//	   public static java.lang.String valueOf(java.lang.Object);
//	   public native java.lang.String intern();
//	    public int compareTo(java.lang.Object);  

	public static void main(String[] args) {
		System.out.println("anu".toUpperCase());
		System.out.println("".length());
		System.out.println(new String().length());
		String s1 = "this is this dubey";
		String s2 = "    this is anu dubey    ";
		//int r = s1.indexOf("this");
		//int r1 = s1.indexOf("is");
		//int r2 = s1.indexOf("anu");
		//int r3 = s1.indexOf("dubey");
		System.out.println(" ** " + s1.indexOf("this"));
		System.out.println(s1.indexOf("is"));
		System.out.println(s1.indexOf("anu"));
		System.out.println(s1.indexOf("dubey"));
		System.out.println(s1.lastIndexOf("anu"));//8
		
		System.out.println(s1.substring(4));//is this dubey
		System.out.println(s1.substring(4, 9));//is t
		System.out.println(s1.concat("anu"+ "" + "dubey"));//this is this dubeyanudubey
		System.out.println(s1.replace("a","s"));//this is snu dubey
		System.out.println(new String(s1).replace("t","f"));//fhis is fhis dubey
		System.out.println(s1.matches("this is anu dubey"));//false
		System.out.println(new String(s1).matches("anu"));//false
		System.out.println(s1.contains("s"));//true
		System.out.println(s1.contains("x"));//false
		System.out.println(s1.trim());// this   is this dubey 
		System.out.println(new String(s2).trim());//this is anu dubey
		Student s3 = new Student("anu",20);
		System.out.println(s3.toString());//Student[name = anu,id = 20]
		String s4 = "welcome back";
		char[] ch = s4.toCharArray();
		int len = ch.length;
		System.out.println(len);//12
		System.out.println("Char Array elements:");//w e l c o m e b a c k
		for(int i = 0;i<len;i++) {
			
		System.out.println(ch[i]);
			
			
		}
		System.out.println(s1.format(s1));// this   is this dubey
		
		float f = 20.5f;
		System.out.println(String.valueOf(f));//20.5
		char ch1[] = {'a','n','u'};

		System.out.println(String.valueOf(ch1));//anu
		int i = 30;
		System.out.println(String.valueOf(i));//30
		boolean boo = true;
		System.out.println(String.valueOf(boo));//true
		
		
		
		

	}

}
