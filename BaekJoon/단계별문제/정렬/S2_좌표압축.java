package 단계별.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class S2_좌표압축 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		int[] sorted = new int[n];
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			sorted[i] = arr[i] = Integer.parseInt(st.nextToken());
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		Arrays.sort(sorted);

		int rank = 0;
		for (int v : sorted) {
			if (!map.containsKey(v)) {
				map.put(v, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int key : arr) {
			int ranking = map.get(key);
			sb.append(ranking).append('\n');
		}
		
		System.out.println(sb);

	}

}
