package BOJ.GraphSearch.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 유기농배추_1012 {

	static int t;
	static int n;
	static int m;
	static int k;
	static int count = 0;
	static int[][] map;
	static boolean[][] visited;
	static StringTokenizer st;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { -1, 1, 0, 0 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		t = Integer.parseInt(br.readLine());

		for (int num = 0; num < t; num++) {
			count = 0;
			st = new StringTokenizer(br.readLine(), " ");
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			map = new int[n][m];
			visited = new boolean[n][m];

			k = Integer.parseInt(st.nextToken());

			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				map[a][b] = 1;
			}

			for (int q = 0; q < n; q++) {
				for (int w = 0; w < m; w++) {
					if (map[q][w] == 1 & visited[q][w] == false) {
						dfs(q, w);
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

	public static void dfs(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
				if (map[nx][ny] == 1 && visited[nx][ny] == false) {
					dfs(nx, ny);
				}
			}
		}

	}

}
