package BOJ.Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 숫자카드_10815 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int[] nArr = new int[n];

		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}

		int m = Integer.parseInt(br.readLine());

		Arrays.sort(nArr);
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int temp = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(nArr, n, temp) + " ");
		}

		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();

	}

	public static int binarySearch(int[] nArr, int n, int search) {
		int first = 0;
		int last = n - 1;
		int mid = 0;

		while (first <= last) {
			mid = (first + last) / 2;

			if (nArr[mid] == search) {
				return 1;
			}

			if (nArr[mid] < search) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		return 0;

	}

}
