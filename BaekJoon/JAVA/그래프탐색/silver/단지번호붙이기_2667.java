package BOJ.GraphSearch.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 단지번호붙이기_2667 {

	static int n;
	static int[][] map ;
	static boolean[][] visited ;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int apartNum = 0;
	static int[] apartNumArr = new int[25];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		Scanner sc = new Scanner(System.in);

		n = Integer.parseInt(st.nextToken());

		map = new int[n][n];
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = input.charAt(j) - '0';
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1 && !visited[i][j]) {
					apartNum++;
					dfs(i, j);
				}
			}
		}

		Arrays.sort(apartNumArr);
		System.out.println(apartNum);
		for (int i = 0; i < apartNumArr.length; i++) {
			if (apartNumArr[i] == 0) {
			} else {
				System.out.println(apartNumArr[i]);
			}
		}

	}

	public static void dfs(int x, int y) {
		visited[x][y] = true;

		apartNumArr[apartNum]++;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
				if (map[nx][ny] == 1 && !visited[nx][ny]) {
					dfs(nx, ny);
				}
			}

		}

	}
}
