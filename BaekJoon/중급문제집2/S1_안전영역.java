package 중급2.day4;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1_안전영역 {

	static int n;
	static int[][] arr;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };
	static int height = 0;
	static boolean[][] visited;
	public static ArrayList<Integer> list;
	static int sum = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		arr = new int[n][n];
		visited = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
				if (height < arr[i][j]) {
					height = arr[i][j];
				}
			}
		}

		list = new ArrayList<Integer>();

		for (int depth = 0; depth <= height; depth++) {
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] > depth && !visited[i][j]) {
						cnt++;
						dfs(i, j, depth);
					}
				}
			}
			for (boolean[] a : visited) {
				Arrays.fill(a, false);
			}
			list.add(cnt);
		}

		int answer = 0;
		answer = Collections.max(list);
		System.out.println(answer);

	}

	public static void dfs(int x, int y, int depth) {
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < n && ny < n && ny >= 0 && ny < n) {
				if (arr[nx][ny] > depth && !visited[nx][ny]) {
					dfs(nx, ny, depth);
				}
			}
		}
	}

}
