package ControlFlow;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(100);
		s1.setName("anu");
		s1.setTenPercentage(65);
		s1.setTwelvePercentage(66);
		s1.setCgpa(8.5F);
		s1.setHasBacklog(false);
		Eligibility eligibility = new Eligibility();
		boolean result = eligibility.isEligible(s1);
		System.out.println(result);

	}

}
