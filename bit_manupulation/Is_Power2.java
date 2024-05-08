package bit_manupulation;

public class Is_Power2 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(16));
//		System.out.println("cnt :" + cntSetBit(9));
//		System.out.println(5 & 1);

	}

	static int cntSetBit(int n) {
		int cnt = 0;
		while (n > 0) {
			cnt += n & 1;
			n = n >> 1;
		}
		return cnt;
	}

	public static boolean isPowerOfTwo(int n) {
		if ((n & n - 1) == 0)
			return true;
		return false;
	}

}
