package 단계별.수학1;

import java.util.Scanner;

public class B1_부녀회장이될테야 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		int[][] dp = new int[15][15];
		for (int i = 0; i < 15; i++) {
			dp[0][i] = i;
			dp[i][1] = 1;
		}

		for (int i = 1; i < 15; i++) {

			for (int j = 2; j < 15; j++) {
				dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
			}
		}

		/**
		 * 4층 3층 2층 1 4 10 1층 1 3 6 10 0층 1 2 3 4 5 6 7 8 9
		 */
		while (tc-- > 0) {
			int floor = sc.nextInt();
			int ho = sc.nextInt();

			System.out.println(dp[floor][ho]);

		}
	}
}
