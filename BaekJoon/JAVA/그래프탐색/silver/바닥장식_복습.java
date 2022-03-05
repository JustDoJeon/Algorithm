package BOJ.GraphSearch.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 바닥장식_복습 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		char[][] bottom = new char[n][m];

		int count = 0;

		for (int i = 0; i < n; i++) {
			bottom[i] = br.readLine().toCharArray();

			for (int j = 0; j < m; j++) {
				if (bottom[i][j] == '-') {
					count++;
					while (j < m && bottom[i][j] == '-') {
						j++;
					}
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (bottom[j][i] == '|') {
					count++;
					while (j < n && bottom[j][i] == '|') {
						j++;
					}
				}
			}
		}

		System.out.println(count);

	}

}
