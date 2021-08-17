package lambdaExpression;

public class Student1 {
	int sid;
	String firstName;
	String lastName;

	public Student1(int sid, String firstName, String lastName) {

		super();
		this.sid = sid;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFirstName() {
		return firstName;
	}

	public boolean setFirstName(String firstName) {
		this.firstName = firstName;
		return false;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		// return "ArrayQue [getSid()=" + getSid() + ", getFirstName()=" +
		// getFirstName() + ", getLastName()="
		// + getLastName() + "]";
		return "" + sid + " " + firstName + " " + lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sid;
		return 0;
	}

//HashCodeAndEqualsExample
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		if (sid != other.sid)
			return false;
		return true;
	}

}
