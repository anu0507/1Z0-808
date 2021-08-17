package Javabasic;

public class Picture {
	String feature;
	String quality;
	int width;
	float size;

	public String cartoonstick() {
		return " tom";
	};

	public String emoji() {
		return " smile";
	};

	public String caption() {
		return " friday";
	};

	public static void main(String[] args) {
		Picture picture = new Picture();
		String result = picture.cartoonstick();
		String result1 = picture.emoji();
		String result2 = picture.caption();
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}

}
