package BOJ.GraphSearch.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토_7576 {

	static int n;
	static int m;
	static int[][] box;
	static boolean visited[][];
	static int count;
	static StringTokenizer st;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		st = new StringTokenizer(br.readLine(), " ");
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		box = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		bfs();

	}

	// 1 -> 익은 토마토 0-> 익지않은 토마토, 정수-1은 토마토가 들어있지 않은 칸.
	public static void bfs() {
		Queue<int[]> queue = new LinkedList<int[]>();

		// 토마토가 있는 좌표 찾아서 queue에 넣기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 1) {
					queue.offer(new int[] { i, j });
				}
			}
		}

		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = now[0] + dx[i];
				int nextY = now[1] + dy[i];

				// 범위밖이면 패스
				if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m) {
					continue;
				}

				// 다음위치가 익지 않은 토마토가 아니면 패스
				if (box[nextX][nextY] != 0) {
					continue;
				}

				// 핵심.. 최대 일수를 구하기 때문에 1로 바꾸는 것이 아니라 현재일수 +1 해줘야함.
				box[nextX][nextY] = box[now[0]][now[1]] + 1;
				queue.add(new int[] { nextX, nextY });
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				max = Math.max(max, box[i][j]);
			}
		}
		System.out.println(max - 1);

	}

}
