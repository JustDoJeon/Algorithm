package 단계별.수학2;

import java.util.Scanner;

public class S1_골드바흐의추측 {
	static boolean[] prime = new boolean[10001];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		getPrime();
		int answer = 1000;
		while (tc-- > 0) {

			int num = sc.nextInt();
			int p = num / 2;
			int q = num / 2;

			while (true) {
				if (!prime[p] && !prime[q]) {
					System.out.println(p + " " + q);
					break;
				}
				p--;
				q++;

			}
		}

	}

	public static void getPrime() {
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
