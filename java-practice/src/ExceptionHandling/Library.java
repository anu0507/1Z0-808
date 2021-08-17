package ExceptionHandling;

public class Library {
	public String search(String book) {
		Book b = new Book();
		String[] books = b.getBooks();
		for (String b1 : books) {
			if (b1.equalsIgnoreCase(book)) {
				return b1;
			}
		}
		throw new BookNotFoundException(book + "  is not available");
	}

}
