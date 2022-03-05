package BOJ.GraphSearch.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_1260 {
	static boolean[] visited;
	static int[][] graph;
	static int n;
	static int m;
	static int start;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();

		graph = new int[1001][1001];
		visited = new boolean[1001];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
			graph[b][a] = 1;
		}

		dfs(start);

		visited = new boolean[1001];

		System.out.println();

		bfs();

	}

	public static void dfs(int i) {
		visited[i] = true;
		System.out.print(i + " ");

		for (int j = 1; j <= n; j++) {
			if (graph[i][j] == 1 && visited[j] == false) {
				dfs(j);
			}
		}

	}

	public static void bfs() {

		Queue<Integer> q = new LinkedList<Integer>();

		q.offer(start);
		visited[start] = true;
		System.out.print(start + " ");

		while (!q.isEmpty()) {
			int temp = q.poll();
			for (int j = 1; j <= n; j++) {
				if (visited[j] == false && graph[temp][j] == 1) {
					q.offer(j);
					visited[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}

}
