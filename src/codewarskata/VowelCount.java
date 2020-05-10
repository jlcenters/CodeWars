package codewarskata;

public class VowelCount {

	public static int kata(String str) {
		int vowelsCount = 0;
		Character[] vowels = new Character[] { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < str.length(); ++i) {
			Character letter = str.charAt(i);
			for (Character vowel : vowels) {
				if (letter == vowel) {
					vowelsCount += 1;
				}
			}
		}
		return vowelsCount;
	}

}
