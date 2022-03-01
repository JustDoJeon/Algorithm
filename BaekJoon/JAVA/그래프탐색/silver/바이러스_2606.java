package BOJ.GraphSearch.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 바이러스_2606 {

	static int n;
	static int m;
	static int[][] arr;
	static boolean[] visited;
	static int answer;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // 1~n까지의 컴퓨터가있음

		m = sc.nextInt();

		arr = new int[n + 1][n + 1];

		visited = new boolean[n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}

		bfs(1);

	}

	public static void bfs(int start) {

		Queue<Integer> q = new LinkedList<Integer>();

		visited[start] = true;
		q.offer(start);

		answer = 0;

		while (!q.isEmpty()) {
			int x = q.poll();
			for (int i = 1; i < arr.length; i++) {
				if (arr[x][i] == 1 && visited[i] == false) {
					q.offer(i);
					visited[i] = true;
					answer++;
				}
			}
		}

		System.out.println(answer);

	}
}
