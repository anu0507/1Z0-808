package StringAPI;

public class StringBufferExample {

	public static void main(String[] args) {

//		 public synchronized int length();
//		  public synchronized int capacity();
//		  public synchronized void ensureCapacity(int);
//		  public synchronized void trimToSize();
//		  public synchronized void setLength(int);
//		  public synchronized char charAt(int);
//		  public synchronized int codePointAt(int);
//		  public synchronized int codePointBefore(int);
//		  public synchronized int codePointCount(int, int);
//		  public synchronized int offsetByCodePoints(int, int);
//		  public synchronized void getChars(int, int, char[], int);
//		  public synchronized void setCharAt(int, char);
//		  public synchronized java.lang.StringBuffer append(java.lang.Object);
//		  public synchronized java.lang.StringBuffer append(java.lang.String);
//		  public synchronized java.lang.StringBuffer append(java.lang.StringBuffer);
//		  synchronized java.lang.StringBuffer append(java.lang.AbstractStringBuilder);
//		  public synchronized java.lang.StringBuffer append(java.lang.CharSequence);
//		  public synchronized java.lang.StringBuffer append(java.lang.CharSequence, int, int);
//		  public synchronized java.lang.StringBuffer append(char[]);
//		  public synchronized java.lang.StringBuffer append(char[], int, int);//////////////////////////
//		  public synchronized java.lang.StringBuffer append(boolean);
//		  public synchronized java.lang.StringBuffer append(char);
//		  public synchronized java.lang.StringBuffer append(int);
//		  public synchronized java.lang.StringBuffer appendCodePoint(int);
//		  public synchronized java.lang.StringBuffer append(long);
//		  public synchronized java.lang.StringBuffer append(float);
//		  public synchronized java.lang.StringBuffer append(double);
//		  public synchronized java.lang.StringBuffer delete(int, int);
//		  public synchronized java.lang.StringBuffer deleteCharAt(int);///////////////////////////
//		  public synchronized java.lang.StringBuffer replace(int, int, java.lang.String);
//		  public synchronized java.lang.String substring(int);
//		  public synchronized java.lang.CharSequence subSequence(int, int);
//		  public synchronized java.lang.String substring(int, int);
//		  public synchronized java.lang.StringBuffer insert(int, char[], int, int);
//		  public synchronized java.lang.StringBuffer insert(int, java.lang.Object);
//		  public synchronized java.lang.StringBuffer insert(int, java.lang.String);
//		  public synchronized java.lang.StringBuffer insert(int, char[]);
//		  public java.lang.StringBuffer insert(int, java.lang.CharSequence);
//		  public synchronized java.lang.StringBuffer insert(int, java.lang.CharSequence, int, int);
//		  public java.lang.StringBuffer insert(int, boolean);
//		  public synchronized java.lang.StringBuffer insert(int, char);
//		  public java.lang.StringBuffer insert(int, int);
//		  public java.lang.StringBuffer insert(int, long);
//		  public java.lang.StringBuffer insert(int, float);
//		  public java.lang.StringBuffer insert(int, double);
//		  public int indexOf(java.lang.String);
//		  public synchronized int indexOf(java.lang.String, int);
//		  public int lastIndexOf(java.lang.String);
//		  public synchronized int lastIndexOf(java.lang.String, int);
//		  public synchronized java.lang.StringBuffer reverse();
//		  public synchronized java.lang.String toString();
//		  public java.lang.AbstractStringBuilder reverse();
//		  public java.lang.AbstractStringBuilder insert(int, double);
//		  public java.lang.AbstractStringBuilder insert(int, float);
//		  public java.lang.AbstractStringBuilder insert(int, long);
//		  public java.lang.AbstractStringBuilder insert(int, int);
//		  public java.lang.AbstractStringBuilder insert(int, char);
//		  public java.lang.AbstractStringBuilder insert(int, boolean);
//		  public java.lang.AbstractStringBuilder insert(int, java.lang.CharSequence, int, int);
//		  public java.lang.AbstractStringBuilder insert(int, java.lang.CharSequence);
//		  public java.lang.AbstractStringBuilder insert(int, char[]);
//		  public java.lang.AbstractStringBuilder insert(int, java.lang.String);
//		  public java.lang.AbstractStringBuilder insert(int, java.lang.Object);
//		  public java.lang.AbstractStringBuilder insert(int, char[], int, int);
//		  public java.lang.AbstractStringBuilder replace(int, int, java.lang.String);
//		  public java.lang.AbstractStringBuilder deleteCharAt(int);
//		  public java.lang.AbstractStringBuilder appendCodePoint(int);
//		  public java.lang.AbstractStringBuilder delete(int, int);
//		  public java.lang.AbstractStringBuilder append(double);
//		  public java.lang.AbstractStringBuilder append(float);
//		  public java.lang.AbstractStringBuilder append(long);
//		  public java.lang.AbstractStringBuilder append(int);
//		  public java.lang.AbstractStringBuilder append(char);
//		  public java.lang.AbstractStringBuilder append(boolean);
//		  public java.lang.AbstractStringBuilder append(char[], int, int);
//		  public java.lang.AbstractStringBuilder append(char[]);
//		  public java.lang.AbstractStringBuilder append(java.lang.CharSequence, int, int);
//		  public java.lang.AbstractStringBuilder append(java.lang.CharSequence);
//		  java.lang.AbstractStringBuilder append(java.lang.AbstractStringBuilder);
//		  public java.lang.AbstractStringBuilder append(java.lang.StringBuffer);
//		  public java.lang.AbstractStringBuilder append(java.lang.String);
//		  public java.lang.AbstractStringBuilder append(java.lang.Object);
//		  public java.lang.Appendable append(char) throws java.io.IOException;
//		  public java.lang.Appendable append(java.lang.CharSequence, int, int) throws java.io.IOException;
//		  public java.lang.Appendable append(java.lang.CharSequence) throws java.io.IOException;
//		  static {};
		StringBuffer sb = new StringBuffer("anu");
		System.out.println(sb.capacity());// 19
		System.out.println(sb.length());// 3
		
		sb.trimToSize();
		System.out.println(sb.capacity());// 3
		System.out.println(sb.length());// 3
		System.out.println(sb.charAt(1));// n
		System.out.println(sb.codePointAt(0));// 97
		StringBuffer sb1 = new StringBuffer("ANU");
		System.out.println(sb1.codePointAt(0));// 65
		System.out.println(sb.codePointCount(0, 2));// 2
		System.out.println(sb.offsetByCodePoints(0, 1));// 1
		System.out.println(sb.charAt(0));// a
		System.out.println(sb.getClass());// class .java.lang.StringBuffer
		System.out.println(sb.append(" " + "dubey" + " " + "i"));// anu dubey i
		System.out.println(sb.delete(10, 11));// anu dubey
		System.out.println(sb.insert(9, true));// anu dubeytrue
		System.out.println(sb.insert(13, 5));// anu dubeytrue5
		char[] ch = { 'k', 'a', 'l', 'a', 'w', 'a', 't', 'i' };
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.append(ch, 0, 3));

	}

}