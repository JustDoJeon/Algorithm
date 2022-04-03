package 단계별.수학2;

import java.util.Scanner;

public class S3_소수구하기 {
	static int count = 0;
	static boolean[] prime;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		prime = new boolean[m + 1];

		getPrime();

		for (int i = n; i <= m; i++) {
			if (!prime[i]) {
				System.out.println(i);
			}
		}

	}

	private static void getPrime() {

		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i]) {
				continue;
			}
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}

	}
}
