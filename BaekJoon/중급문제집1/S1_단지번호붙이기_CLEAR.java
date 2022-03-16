package 중급0314시작.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class S1_단지번호붙이기_CLEAR {

	static int n;
	static int[][] graph;
	static int cnt;
	static int[] dx = { 0, 1, -1, 0 };
	static int[] dy = { -1, 0, 0, 1 };
	static boolean[][] visited;
	static int innerCnt = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		graph = new int[n][n];
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (graph[i][j] == 1 && visited[i][j] == false) {
					bfs(i, j);
					list.add(innerCnt);
					cnt++;
				}
			}
		}
		Collections.sort(list);
		System.out.println(cnt);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void bfs(int x, int y) {
		innerCnt = 1;
		Queue<Location> queue = new LinkedList<Location>();
		queue.offer(new Location(x, y));
		visited[x][y] = true;

		while (!queue.isEmpty()) {
			Location temp = queue.poll();
			int nowX = temp.x;
			int nowY = temp.y;

			for (int i = 0; i < 4; i++) {
				int nx = nowX + dx[i];
				int ny = nowY + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if (visited[nx][ny] == false && graph[nx][ny] == 1) {
						queue.add(new Location(nx, ny));
						innerCnt++;
						visited[nx][ny] = true;
					}
				}
			}
		}
	}

}

class Location {
	int x;
	int y;

	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
