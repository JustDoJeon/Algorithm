package 단계별.함수;

import java.util.Scanner;

public class S4_한수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = countNum(n);
		System.out.println(a);

	}

	public static int countNum(int n) {
		int cnt = 0;

		if (n <= 99) {
			cnt = n;
		} else {
			cnt = 99;
			if (n == 1000) {
				n = 999;
			}

			while (n >= 100) {
				int hun = n / 100;
				int ten = (n % 100) / 10;
				int one = n % 10;
				if ((ten - one) == (hun - ten)) {
					cnt++;
				}

				n = n - 1;
			}

		}

		return cnt;

	}

}
