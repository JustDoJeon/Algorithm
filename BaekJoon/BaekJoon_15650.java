package BackTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_15650 {

	static int N;

	static int M;

	static int[] arr;

	static boolean[] visit;

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M];
		visit = new boolean[N];

		dfs(1, 0);
		System.out.println(sb);

		for (int b : arr) {
			System.out.println("arr배열 내부 " + b + "");
		}

	}

	public static void dfs(int at, int depth) {

		if (depth == M) {
			/*
			 * 깊이가 M이랑 같을경우 출력
			 */
			for (int a : arr) {
				sb.append(a).append(' ');
			}
			sb.append('\n');
			return;
		}

		/*
		 * i 는 at 부터 탐색하도록 한다.
		 */
		for (int i = at; i <= N; i++) {
			// 현재 깊이를 index로 하여 해당 위치에 i 값을 담는다
			arr[depth] = i;

			/*
			 * 재귀호출 : 현재 i 값보다 다음 재귀에서 더 커야하므로 i + 1 의 값을 넘겨주고, 깊이 또한 1 증가시켜 재귀호출해준다
			 */
			dfs(i + 1, depth + 1);
		}

	}

}
