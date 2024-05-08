package bit_manupulation;

public class BitOperator {
	public static void main(String[] args) {
//		System.out.println(isSet(35, 1));
//		System.out.println(1 << 1);
		setBit(16);

	}

	static void setBit(int n) {
		System.out.println(n & n - 1);
	}

	static void toggleBit(int n, int i) {
		System.out.println((n ^ (1 << i)));
	}

	static boolean isSet(int n, int i) {
		if ((n & (1 << i)) == 0)
			return false;
		return true;
	}

	static void clearSet(int n, int i) {
		System.out.println((n & ~(1 << i)));
	}
}
