package lambdaExpression;

public class Student implements Comparable {
	int sid;
	String name;
	int phone;
	
	

	public Student(int sid, String name, int phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		
	}



	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
	}



	public String getName() {
		return name;
	}



	public boolean setName(String name) {
		this.name = name;
		return false;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public static void main(String[] args) {

	}



	@Override
	public String toString() {
		//return "Student[sid=" + sid + ", name=" + name + ", phone=" + phone + "]";
	return ""+ sid + " "+ name +" "+ phone;
	//return getClass().getName() + " " + Integer.toHexString(hashCode());
	}



	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		return this.name.compareTo(s.name);
	}



	
	

}
