package Online_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BaekJoon_1463 {
//2020-08-18
	/*
	 * dp를 풀기 위해서는 top-down방식과 bottom-up 방식이 있음 탑다운은 재귀함수를 이용하는 계산방식 바텀업은 반복문을 이용해서
	 * 계산하는 방식 둘다 공통적으로 d[] 라는 메모배열 만들어서 그곳에 계산 결과를 저장해놓고 사용했음 작은 문제들을 연결해서 큰 문제를
	 * 해결하는 방식을 취하고 있다.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int dp[] = new int[number + 1];
		dp[0] = 0;
		dp[1] = 0;

		for (int i = 2; i <= number; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 2 == 0)
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			if (i % 3 == 0)
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);

		}
		System.out.println(dp[number]);
		br.close();
	}
}
