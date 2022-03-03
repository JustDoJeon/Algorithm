package BOJ.GraphSearch.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 미로탐색_2178 {

	static int n;
	static int m;
	static int[][] map;
	static boolean[][] visited;
	static int cnt;

	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n][m];

		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}

		visited[0][0] = true;

		bfs(0, 0);

		System.out.println(map[n - 1][m - 1]);
	}

	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] { x, y });

		while (!queue.isEmpty()) {

			int[] now = queue.poll();
			int nowX = now[0];
			int nowY = now[1];

			for (int i = 0; i < 4; i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];

				if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m) {
					continue;
				}

				if (visited[nextX][nextY] == true || map[nextX][nextY] == 0) {
					continue;
				}

				queue.add(new int[] { nextX, nextY });
				map[nextX][nextY] = map[nowX][nowY] + 1;
				// 위에 주석하고 count ++; 해서 길이 늘려가면 안되나 
				visited[nextX][nextY] = true;
			}
		}

	}

}
