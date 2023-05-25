
public class recursionUnknown {
	public static int Unknown(int x, int y) {
		if (x < y) {
			return Unknown(x + 1, y) * 2;
		} else {
			if (x == y) {
				return 1;
			} else {
				System.out.println(x + y);
				return Unknown(x - 1, y) / 2;
			}
		}
	}

	public static int IterativeUnknown(int x, int y) {
		int difference = 0;
		int returnValue = 1;

		if (x < y) {
			difference = y - x;
			for (int i = 0; i < difference; i++) {
				returnValue = returnValue * 2;
			}
		}

		if (x > y) {
			difference = x - y;
			for (int i = 0; i < difference; i++) {

				System.out.println(x + y);
				x = x - 1;
			}
			returnValue = 0;
		}
		return returnValue;
	}

	public static void main(String args[]) {
		System.out.println(Unknown(10,15));
		System.out.println(Unknown(10, 10));
		System.out.println(Unknown(15, 10));

		System.out.println(IterativeUnknown(10,15));
		System.out.println(IterativeUnknown(10, 10));
		System.out.println(IterativeUnknown(15, 10));
	}
}
