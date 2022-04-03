package 단계별.수학2;

import java.util.Scanner;

public class S5_소수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean flag = false;

		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = n; i <= m; i++) {
			if (isPrime(i) && i != 1) {
				flag = true;
				sum += i;
				min = Math.min(i, min);
			}
		}

		if (flag) {
			System.out.println(sum);
			System.out.println(min);
		} else {
			System.out.println(-1);
		}

	}

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
