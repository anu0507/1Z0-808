package opps.pack1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import opps.pack2.Dog;

public class EncapsulationProblem {
	private int age;
	private List<Integer> list = new ArrayList<>();
	private String name;
	private Integer salary;
	private Date dob = new Date();
	private Dog dog = new Dog();



	public int getAge() {
		return age;
	}

	public List<Integer> getList() {
		list.add(20);
		list.add(30);
		return (List<Integer>) ((ArrayList<Integer>)list).clone();
	}

	public String getName() {
		return name;
	}

	public Integer getSalary() {
		return salary;
	}

	public Date getDob() {
		
		return (Date) dob.clone();
	}

	public Dog getDog() {
		Dog d = new Dog();
		d.setName(dog.getName());
		return d;
	}

	@Override
	public String toString() {
		return "EncapsulationProblem [age=" + age + ", list=" + list + ", name=" + name + ", salary=" + salary
				+ ", dob=" + dob + ", dog=" + dog.getName() + "]";
	}



}
