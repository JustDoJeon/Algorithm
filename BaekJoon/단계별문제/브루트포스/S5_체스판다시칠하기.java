package 단계별.브루트포스;

import java.util.Scanner;

public class S5_체스판다시칠하기 {
	static int n;
	static int m;
	static char[][] arr;

	public static void main(String[] args) {
		int cnt = 0;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // row
		m = sc.nextInt(); // col
		String[] board = new String[n];

		// 1.input 받기
		for (int i = 0; i < n; i++) {
			board[i] = sc.nextLine();
		}

		// 체스판 자르기
		int sol = Integer.MAX_VALUE;
		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				int curSol = getSolution(i, j, board);
				if (sol > curSol) {
					sol = curSol;
				}
			}
		}
		System.out.println(sol);
		sc.close();
	}

	private static int getSolution(int startRow, int startCol, String[] board) {
		String[] orgBoard = { "WBWBWBWB", "BWBWBWBW" };
		int whiteSol = 0;
		for (int i = 0; i < 8; i++) {
			int row = startRow + i;
			for (int j = 0; j < 8; j++) {
				int col = startCol + j;
				if (board[row].charAt(col) != orgBoard[row % 2].charAt(j)) {
					whiteSol++;
				}
			}
		}
		return Math.min(whiteSol, 64-whiteSol);
	}

}
