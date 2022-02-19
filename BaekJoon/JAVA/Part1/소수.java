package prac.part1;

import java.util.Arrays;
import java.util.Scanner;

public class 소수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[] arr = new int[N];
		int sum = 0;
		int idx = 0;
		int min = Integer.MAX_VALUE;
		for (int i = M; i <= N; i++) {
			if (isPrime(i)) {
				arr[idx] = i;
				sum += i;
				idx++;
			}
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && min > arr[i]) {
				min = arr[i];
			}
		}

		if (sum ==0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

	public static boolean isPrime(int n) {
		boolean flag = true;

		int check = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				check++;
			}
		}

		if (check == 2) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;
	}

}
