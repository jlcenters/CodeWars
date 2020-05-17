package codewarskata;

public class TenMinWalk {

	public static boolean isValid(char[] walk) {
		int x = 0, y = 0;

		if (walk.length == 10) {
			return false;
		}

		for (char block : walk) {
			switch (block) {
			case 'n':
				y++;
				break;
			case 's':
				y--;
				break;
			case 'w':
				x++;
				break;
			case 'e':
				x--;
				break;
			}
		}
		return (x == 0) && (y == 0);
	}
}
