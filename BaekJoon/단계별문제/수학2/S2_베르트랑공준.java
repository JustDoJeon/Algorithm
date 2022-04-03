package 단계별.수학2;

import java.util.Scanner;

public class S2_베르트랑공준 {
	static boolean[] prime = new boolean[246913];
	static int num;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		getPrime();
		while (true) {
			int count = 0;
			num = sc.nextInt();

			if (num == 0) {
				System.exit(0);
			}

			for (int i = num + 1; i <= num * 2; i++) {
				if (!prime[i]) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

	public static void getPrime() {
		prime[0] = true;
		prime[1] = true;

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
