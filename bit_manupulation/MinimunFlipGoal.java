package bit_manupulation;

public class MinimunFlipGoal {

	public static void main(String[] args) {
//		System.out.println((8 & 1) == (7 & 1));
//		System.out.println(minimumFlipToGoal(10, 7));
//		System.out.println(intToBit(9));
		printLastBit(6);
	}

	static int minimumFlipToGoal(int start, int goal) {
		int cnt = 0;
		while (start != 0 || goal != 0) {
			if ((start ^ goal) != 0) {
				cnt++;
			}
			System.out.println("start: " + intToBit(start) + " goal: " + intToBit(goal) + " cnt: " + cnt);

			start = start >> 1;
			goal = goal >> 1;

		}
		return cnt;
	}

	static void printLastBit(int n) {
		while (n != 0) {
			System.out.println(n & 1);
			n = n >> 1;
		}
	}

	static String intToBit(int n) {
		StringBuilder str = new StringBuilder();
		while (n != 0) {
			str.append(n & 1);
			n = n >> 1;
		}
		return str.reverse().toString();
	}

}
