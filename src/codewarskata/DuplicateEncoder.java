package codewarskata;

public class DuplicateEncoder {

	static String kata(String word) {
		String result = "";

		for (int i = 0; i < word.length(); ++i) {
			String comp = "" + word.charAt(i) + "";
			for (int j = 0; j < word.length(); ++j) {

				if (j != i) {
					if (comp.equalsIgnoreCase("" + word.charAt(j) + "")) {
						result += ")";
						break;
					} else if ((!comp.equalsIgnoreCase("" + word.charAt(j) + "")) && (j == (word.length() - 1))) {
						result += "(";
						break;
					}
				} else if ((j == i) && (j == word.length() - 1)) {
					result += "(";
				}
			}
		}
		return result;
	}
}
