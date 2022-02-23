package BOJ.Greedy;

import java.util.Scanner;

public class 펭귄추락대책위원회_18228 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		int targetIdx = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == -1) {
				targetIdx = i;
			}
		}

		int sumA = Integer.MAX_VALUE;

		for (int i = 0; i < targetIdx; i++) {
			sumA = Math.min(arr[i], sumA);
		}
		int sumB = Integer.MAX_VALUE;
		for (int i = targetIdx + 1; i < arr.length; i++) {
			sumB = Math.min(arr[i], sumB);
		}

		System.out.println(sumB + sumA);

	}

}
