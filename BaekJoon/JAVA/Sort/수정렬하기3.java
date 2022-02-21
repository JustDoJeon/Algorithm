package Algo_Study.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기3 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		int[] list = new int[n];

		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(list);

//		System.out.println(list);

		for (int val : list) {
			sb.append(val + "\n");
		}

		System.out.println(sb);

	}
}
