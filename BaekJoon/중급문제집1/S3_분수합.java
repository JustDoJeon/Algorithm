package 중급0314시작.day3;

import java.util.Scanner;

public class S3_분수합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		// 분모
		int mo = y1 * y2;
		int ja = x1 * y2 + x2 * y1;

		int mod = 0;
		mod = gcd(mo, ja);

		if (mod != 1) {
			System.out.println(ja / mod + " " + mo / mod);
		} else {
			System.out.println(ja + " " + mo);
		}
	}

	public static int gcd(int a, int b) {
		if (a <= b) {
			int temp = a;
			a = b;
			b = temp;
		}

		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
