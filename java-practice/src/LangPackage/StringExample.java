package LangPackage;

public class StringExample {
	public static String reverseWord(String s) {
		String str = "";
		String[] charList = s.split("");
		for (int i = charList.length - 1; i >= 0; i--) {
			str = str + charList[i];

		}

		return str;

	}

	public static String reverseWord2(String s) {
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			str = str + s.charAt(i);

		}

		return str;

	}

	public static String reverseSentence(String sentence) {
		String str = "";
		String[] words = sentence.split(" ");
		// String[] reverseWords = new String[words.length];
		for (int i = words.length - 1; i >= 0; i--) {
			str = str + words[i] + " ";
		}

		return str;
	}

	public static String reverseWord(String sen, String word) {
		String str = "";
		String[] words = sen.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word)) {
				words[i] = reverseWord2(word);

			}
			str = str + words[i] + " ";
		}
		return str;
	}

	public static void main(String[] args) {
		String s = "anu";
		// String s1 = new String("kalawati");
		// String s2 = "kalawati";
		// s.concat("amit");
		s = s + "kalawati" + "amit";
		String result = reverseWord2("my name is khan");
		System.out.println(result);
		String s1 = "kalawati";
		// System.out.println(s1.charAt(8));

	}

}
