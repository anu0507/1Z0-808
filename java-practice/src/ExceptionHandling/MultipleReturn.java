package ExceptionHandling;

class MultipleReturn {
	int getInt() {
		int returnVal = 10;
		try {
			String[] students = { "Anu", "Kalawati" };
			System.out.println(students[4]);
		} catch (Exception e) {
			return returnVal;
		} 
		finally {
			return 20;
		}
		
	}

	public static void main(String[] args) {
		MultipleReturn r = new MultipleReturn();
		System.out.println(r.getInt());
	}
}