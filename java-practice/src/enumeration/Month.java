package enumeration;

public enum Month {

	/*
	 * enum w.r.t inheritance, enum class cannot extends any other enum class but it
	 * can implements any nos of interfaces . you cannot create child of enum
	 * class(you can cannot extends enum class) enum class is by default final & one
	 * cannot create child of final class. java.lang.Enum is the direct parent class
	 * of every enum class. compiler automatically provide 2 static method 1.
	 * values() and 2. valuesOf(). public static Month valueOf(java.lang.String);
	 * public static Month[] values(); enum class implicity implements 2 interfaces
	 * Comparable,Serializable. we can
	 * 
	 */
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);
	private int month;

	private Month(int month) {
		this.month = month;
	}

}
