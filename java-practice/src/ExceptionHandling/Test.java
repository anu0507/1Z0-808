package ExceptionHandling;

public class Test {

	public static void main(String[] args) {
		Library l = new Library();
	//try {
		//String book1 = l.search("Java1");
		//System.out.println(book1);
//	} catch (BookNotFoundException b2) {
//		System.out.println(b2.getMessage());
//
//	}
		String book1 = l.search("Java1");
		System.out.println(book1);

	}

}
