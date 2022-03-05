package prac.part1;

import java.util.Scanner;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(gcd(a, b));
		System.out.println(a * b / gcd(a, b));

	}

	public static int gcd(int a, int b) {
		int answer = 0;

		int big = Math.max(a, b);
		int small = Math.min(a, b);

		int nam = 1;
		while (small != 0) {
			if (big % small == 0) {
				answer = small;
				break;
			} else {
				nam = big % small;
				big = small;
				small = nam;
			}
		}

		return answer;
	}

}
