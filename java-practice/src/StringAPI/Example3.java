package StringAPI;

public class Example3 {

	public static void main(String[] args) {
//		  public char[] toCharArray();
String s = "anu";
   char[] ch = s.toCharArray();
   int l = ch.length;
   
   
   System.out.println("Char element Arrays:" );
   for(int i = 0;i<l;i++) {
	   System.out.println(ch[i]);
   }
	}

}
