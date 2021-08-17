package ExceptionHandling;

class MultipleReturn2 {
	int getInt() {
		int returnVal = 20;
		try {
			String[] students = { "Anu", "Kalawati" };
			System.out.println(students[4]);
		} catch (Exception e) {
			return returnVal;
		} finally {
			returnVal += 10;
		}
		return returnVal;
	}

	public static void main(String[] args) {
		MultipleReturn2 r2 = new MultipleReturn2();
		System.out.println(r2.getInt());
	}
}