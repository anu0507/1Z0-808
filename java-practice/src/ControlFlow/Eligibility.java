package ControlFlow;

public class Eligibility {
	public boolean isEligible(Student s1) {
		if (s1.getTenPercentage() >= 60) {
			if (s1.getTwelvePercentage() >= 60) {
				if (s1.getCgpa() >= 6.0f) {
					if (!s1.isHasBacklog()) {
						return true;

					} else {
						return false;
					}
				} else {
					return false;
				}

			} else {
				return false;
			}

		} else {
			return false;

		}

	}

}
