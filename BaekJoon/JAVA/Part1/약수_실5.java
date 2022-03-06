package boj;

import java.util.Arrays;
import java.util.Scanner;

public class 약수_실5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// 2 3 4 6 8 12
		Arrays.sort(arr);

		int answer = arr[0] * arr[arr.length - 1];

		System.out.println(answer);

	}

	public static int yaksu(int a) {

		int sum = 0;
		// 약수의 갯수를 구하는 로직
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && i != 1 && i != a) {
				sum++;
			}
		}
		return sum;

	}

}
