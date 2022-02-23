package BOJ.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ATM_11399 {

	public static void main(String[] args) {

		// 1 2 3 4 5
		// 3 1 4 3 2
		/*
		 * 1번 사람 3분 2번 사람 3+1분 4분 3번 3+1+4 = 8
		 * 
		 */

		// 2 5
		// 1 2 3 3 4
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int sum[] = new int[n];
		// 1 2 3 3 4

		int total = 0;
		int arrSum = 0;
		for (int i = 0; i < n; i++) {
			total = total + arr[i];
			sum[i] = total; // 1
			arrSum = arrSum + total;
//			System.out.println(arrSum);

		}
		int ans = 0;
		for (int i = 0; i < sum.length; i++) {
			ans += sum[i];
		}
		System.out.println(ans);

	}

}
