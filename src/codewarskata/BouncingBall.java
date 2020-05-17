package codewarskata;

public class BouncingBall {

	public static int bouncingBall(double h, double bounce, double window) {
		if ((h <= 0) || (bounce <= 0) || (bounce >= 1) || (window >= h)) {
			return -1;
		}

		int ball = 0;
		do {
			ball++;
			h *= bounce;
			if (h > window) {
				ball++;
			}
		} while (h > window);

		return ball;
	}
}
