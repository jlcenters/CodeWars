package codewarskata;

public class Sum {

	public int getSum(int a, int b) {
		int sum = 0;
		if (a > b) {
			for (int i = b; i <= a; ++i) {
				sum += i;
			}
		} else {
			for (int i = a; i <= b; ++i) {
				sum += i;
			}
		}
		return sum;
	}
}
