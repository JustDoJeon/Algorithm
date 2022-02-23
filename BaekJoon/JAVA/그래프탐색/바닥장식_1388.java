package BOJ.bfs;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 바닥장식_1388 {

	static int N;
	static int M;
	static char[][] board;
	static int[] dx = { 1, 0 };
	static int[] dy = { 0, 1 };
	static boolean[][] visited;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		board = new char[N][M];

		int count = 0;

		for (int i = 0; i < N; i++) {
			board[i] = sc.next().toCharArray();
			for (int j = 0; j < M; j++) {
				if (board[i][j] == '-') {
					count++;
					while (j < M && board[i][j] == '-') {
						j++;
					}
				}
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (board[j][i] == '|') {
					count++;
					while (j < N && board[j][i] == '|') {
						j++;
					}
				}
			}
		}

		System.out.println(count);

	}
}
