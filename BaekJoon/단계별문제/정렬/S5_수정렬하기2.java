package 단계별.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//O(n)에 풀어야함
public class S5_수정렬하기2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		/*
		 * -1000000 ~ 1000000 기준점 0 = index 100000 으로 생각
		 */

		boolean[] arr = new boolean[2000001];
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]) {
				sb.append((i - 1000000)).append('\n');
			}
		}

		System.out.println(sb);

	}

}
