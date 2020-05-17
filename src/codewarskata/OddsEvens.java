package codewarskata;

public class OddsEvens {

	public static String oddOrEven(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		if (sum % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}
}
