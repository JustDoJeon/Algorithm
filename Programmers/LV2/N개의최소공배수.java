package 프로그래머스.LV2;

public class N개의최소공배수 {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 8, 14 };
		boolean flag = false;
		int lcm1 = arr[0];
		for (int i = 0; i < arr.length; i++) {
			lcm1 = lcm(lcm1, arr[i]);

		}
		System.out.println(lcm1);

	}

	public static int gcd(int a, int b) {

		if (a % b == 0) {
			return b;
		}

		return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

}
