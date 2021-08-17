package StringAPI;

public class StringBuilderExample {

	private static final char Character = 0;

	public static void main(String[] args) {
//		 public java.lang.StringBuilder append(char[]);
//		  public java.lang.StringBuilder append(char[], int, int);
//		  public java.lang.StringBuilder append(boolean);
//		  public java.lang.StringBuilder append(char);
//		  public java.lang.StringBuilder append(int);
//		  public java.lang.StringBuilder append(long);
//		  public java.lang.StringBuilder append(float);
//		  public java.lang.StringBuilder append(double);
//		  public java.lang.StringBuilder appendCodePoint(int);//////////////////////
//		  public java.lang.StringBuilder delete(int, int);
//		  public java.lang.StringBuilder deleteCharAt(int);
//		  public java.lang.StringBuilder replace(int, int, java.lang.String);
//		  public java.lang.StringBuilder insert(int, char[], int, int);
//		  public java.lang.StringBuilder insert(int, java.lang.Object);
//		  public java.lang.StringBuilder insert(int, java.lang.String);
//		  public java.lang.StringBuilder insert(int, char[]);
//		  public java.lang.StringBuilder insert(int, java.lang.CharSequence);
//		  public java.lang.StringBuilder insert(int, java.lang.CharSequence, int, int);
//		  public java.lang.StringBuilder insert(int, boolean);
//		  public java.lang.StringBuilder insert(int, char);
//		  public java.lang.StringBuilder insert(int, int);
//		  public java.lang.StringBuilder insert(int, long);
//		  public java.lang.StringBuilder insert(int, float);
//		  public java.lang.StringBuilder insert(int, double);
//		  public int indexOf(java.lang.String);
//		  public int indexOf(java.lang.String, int);
//		  public int lastIndexOf(java.lang.String);
//		  public int lastIndexOf(java.lang.String, int);
//		  public java.lang.StringBuilder reverse();
//		  public java.lang.String toString();
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
//		  public java.lang.String substring(int, int);
//		  public java.lang.CharSequence subSequence(int, int);
//		  public java.lang.String substring(int);
//		  public java.lang.AbstractStringBuilder replace(int, int, java.lang.String);/////////////////////
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
//		  public java.lang.AbstractStringBuilder append(java.lang.StringBuffer);
//		  public java.lang.AbstractStringBuilder append(java.lang.String);
//		  public java.lang.AbstractStringBuilder append(java.lang.Object);
//		  public void setCharAt(int, char);////////////////////////
//		  public void getChars(int, int, char[], int);
//		  public int offsetByCodePoints(int, int);
//		  public int codePointCount(int, int);
//		  public int codePointBefore(int);
//		  public int codePointAt(int);
//		  public char charAt(int);
//		  public void setLength(int);
//		  public void trimToSize();
//		  public void ensureCapacity(int);
//		  public int capacity();
//		  public int length();
//		  public java.lang.Appendable append(char) throws java.io.IOException;
//		  public java.lang.Appendable append(java.lang.CharSequence, int, int) throws java.io.IOException;
//		  public java.lang.Appendable append(java.lang.CharSequence) throws java.io.IOException;
		StringBuilder ss = new StringBuilder("dubey");
		System.out.println(ss.append(0));//dubey0
		System.out.println(ss.append("anu"));//dubey0anu
		System.out.println(ss.appendCodePoint(0));//dubey0anu
		System.out.println(ss.insert(0, 5));//5dubey0anu
		System.out.println(ss.indexOf("dubey"));//1
		System.out.println(ss.capacity());//21
		StringBuilder ss1 = new StringBuilder("kalawati");
		
		StringBuilder replace = ss1.replace(0,4,"anuj");
		
		System.out.println(replace);
		
		

	}	
}
