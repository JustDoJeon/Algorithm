package 단계별.수학2;

import java.util.Scanner;

public class S4_소수찾기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i]) && arr[i] != 1) {
				cnt++;
			}
		}
		System.out.println(cnt);

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
