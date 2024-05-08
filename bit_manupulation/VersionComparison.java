package bit_manupulation;

public class VersionComparison {

	public static void main(String[] args) {
		String version1 = "1.01";
		String version2 = "1.001";
		System.out.println(compareVersion(version1, version2));

	}

	public static int compareVersion(String version1, String version2) {
		int i = 0;
		int j = 0;
		int m = version1.length();
		int n = version2.length();
		while (i < m || j < n) {
			int num1 = 0;
			int num2 = 0;
			while (i < m && version1.charAt(i) != '.') {
				num1 = (num1 * 10) + (version1.charAt(i) - '0');
				i++;
			}
			while (j < n && version2.charAt(j) != '.') {
				num2 = (num2 * 10) + (version2.charAt(j) - '0');
				j++;
			}
			System.out.println(i + " " + j);
			if (num1 > num2)
				return 1;
			if (num1 < num2)
				return -1;
			System.out.println(num1 + " " + num2);

			i++;
			j++;

		}

		return 0;
	}

}
