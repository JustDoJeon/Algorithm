package Online_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2020-08-19

public class BaekJoon_11052 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 4개를 갖고싶어 dp[4] = Math.max(dp[4],dp[4-i]
		/*
		 * d[n] = n개의 카드팩을 살때 지불해야되는 최대 비용 p[n] = n개의 카드팩을 살때 지불하는 비용 d[n] 에 대한 점화식을 세워서
		 * 구하기
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int d[], p[], length;

		d = new int[n + 1];

		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		length = st.countTokens();
		p = new int[length + 1];

		// 입력값 받기
		for (int i = 1; i <= length; i++) {
			p[i] = Integer.parseInt(st.nextToken());

		}
		
		d[0] = 0;
		for(int i=1; i<=n; i++) {
			int max = 0;
			for(int j=1; j<=i;j++) {
				int temp = d[i-j] + p[j];
				if(temp > max) {
					max = temp;
				}
			}
			d[i] = max;
		}
		
		System.out.println(d[n]);

	}

}
