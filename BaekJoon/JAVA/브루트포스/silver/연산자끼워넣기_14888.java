package BOJ.BruteForce.silver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 연산자끼워넣기_14888 {

	static int n;
	static int[] arr;
	static int[] operator;
	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n];
		operator = new int[4];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// 연산자 입력
		for (int i = 0; i < 4; i++) {
			operator[i] = sc.nextInt();
		}

		dfs(arr[0], 1);

		System.out.println(MAX);
		System.out.println(MIN);

	}

	public static void dfs(int num, int idx) {
		if (idx == n) {
			System.out.println("aaa");
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}

		for (int i = 0; i < 4; i++) {

			if (operator[i] > 0) {
				operator[i]--;

				switch (i) {
				case 0:
					dfs(num + arr[idx], idx + 1);
					break;
				case 1:
					dfs(num - arr[idx], idx + 1);
					break;
				case 2:
					dfs(num * arr[idx], idx + 1);
					break;
				case 3:
					dfs(num / arr[idx], idx + 1);
					break;

				}

				// 재귀 호출이 종료되면 다시 해당 연산자 개수를 복구한다.
				operator[i]++;
			}

		}

	}

}
