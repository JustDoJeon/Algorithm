package 중급2.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_성지키기_다시 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] map = new char[n][m];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = str.charAt(j);
			}
		}

		// i 0 -4 //
		// j0 - 4
		int row = 0;
		int col = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 'X') {
					flag = false;
					break;
				}
			}
			if (flag) {
				row++;
			}
		}

		for (int i = 0; i < m; i++) {
			boolean flag = true;
			for (int j = 0; j < n; j++) {
				if (map[j][i] == 'X') {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				col++;
			}
		}
		
		System.out.println(Math.max(col, row));
	}
}
