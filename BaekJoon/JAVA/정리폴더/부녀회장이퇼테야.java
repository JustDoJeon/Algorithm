package TEST;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

//여기 후딱 풀자
public class 부녀회장이퇼테야 {
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		while (true) {

			if (t == 0) {
				break;
			}

			t = t - 1;

			int[][] apart = new int[15][15];

			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());

			for (int i = 0; i < 15; i++) {
				apart[0][i] = i;
				apart[i][1] = 1;
			}

			for (int i = 1; i < 15; i++) {
				for (int j = 1; j < 15; j++) {
					apart[i][j] = apart[i - 1][j] + apart[i][j - 1];
				}
			}

			System.out.println(apart[a][b]);
		}
	}
}
