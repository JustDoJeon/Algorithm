package BOJ.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 점프왕젤리 {
	static int n;
	static int[][] board;
	static boolean[][] visited;
	static int dx[] = { 0, 1 };
	static int dy[] = { 1, 0 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		board = new int[n][n];
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		bfs();

	}

	public static void bfs() {
		visited[0][0] = true;

		Queue<int[]> q = new LinkedList<int[]>();

		q.offer(new int[] { 0, 0 });

		while (!q.isEmpty()) {
			int[] current = q.poll();
			int count = board[current[0]][current[1]];

			if (count == -1) {
				System.out.println("HaruHaru");
				return;
			}

			for (int i = 0; i < 2; i++) {
				int nx = current[0] + dx[i] * count;
				int ny = current[1] + dy[i] * count;

				if (nx >= 0 && ny >= 0 && nx < n && ny < n && visited[nx][ny] == false) {
					visited[nx][ny] = true;
					q.offer(new int[] { nx, ny });
				}
			}

		}
		System.out.println("Hing");

	}
}
