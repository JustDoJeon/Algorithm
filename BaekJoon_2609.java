package Online_Lecture;

import java.util.Scanner;

// 2020-08-14
public class BaekJoon_2609 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		long b = sc.nextInt();

		long gcd = getGCD(Math.max(a, b), Math.min(a, b));

		long lcm = getLCM(a, b, gcd);

		System.out.println(gcd);
		System.out.println(lcm);

	}

	public static long getGCD(long a, long b) {
		while (b > 0) {
			long tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}

	public static long getLCM(long a, long b, long gcd) {
		return (a * b) / gcd;

	}

}
