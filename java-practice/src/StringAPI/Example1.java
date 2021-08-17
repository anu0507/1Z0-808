package StringAPI;

import Wrapper.Student;

public class Example1 {
//	 public boolean isEmpty();
//	  public char charAt(int);
//	  public boolean equals(java.lang.Object);
//	  public boolean contentEquals(java.lang.StringBuffer);
//	  public boolean contentEquals(java.lang.CharSequence);
//	  public boolean equalsIgnoreCase(java.lang.String);
//	  public int compareTo(java.lang.String);
//	  public int compareToIgnoreCase(java.lang.String);
//	   public boolean startsWith(java.lang.String, int);
//	  public boolean startsWith(java.lang.String);
//	  public boolean endsWith(java.lang.String);
//	  public int hashCode();
//	 
	public static void main(String[] args) {
		String s = "anu";
		System.out.println(s.isEmpty());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.equals(10));
		System.out.println(s.equals("ambe"));
		System.out.println(s.equals('a'));
		Student student = new Student("anu", 100);
		System.out.println(s.equals(student));
		System.out.println(s.equals(new Student("anu", 100)));
		System.out.println(new String("anu").equals("Anu"));
		System.out.println(s.equalsIgnoreCase("ANU"));
		System.out.println(s.compareTo("anu1"));
		System.out.println(s.compareToIgnoreCase("ANU"));
		System.out.println(s.startsWith("a"));
		String[] s1 = { "anu", "ambe", "anjali", "divya", "aakansha", "ankita", "prachi" };
		for (int i = 0; i < s1.length; i++) {
			// if (s1[i].endsWith("i")) {
			// System.out.println(s1[i]);

			// }
			if (s1[i].startsWith("a") && !s1[i].endsWith("i")) {
				System.out.println(s1[i]);
			}

		}

	}

}
