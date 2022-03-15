package 중급0314시작.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 약수_clear {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] input = new int[n];

		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(input);
		int answer = 0;

		answer = input[0] * input[n - 1];

		System.out.println(answer);

	}

}
