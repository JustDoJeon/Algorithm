package BOJ.Greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 신입사원_1946 {

	static int t;
	static int n;
	static int[][] arr;
	static int aRank;
	static int bRank;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		t = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < t; tc++) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n][2];
			int cnt = 1; // 정렬의 첫번째 사람은 자동 채용
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}

			// 정렬-Comparator 구현
			Arrays.sort(arr, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
					// return Integer.compare(o1[0],o2[0]);
				}
			});

			int pivot = arr[0][1]; // 첫번째 지원자의 면접 성적을 기준으로 함.
			for (int i = 1; i < n; i++) {
				if (arr[i][1] < pivot) {
					pivot = arr[i][1];
					cnt++;
				}
			}

			System.out.println(cnt);

		}
		br.close();
	}
}