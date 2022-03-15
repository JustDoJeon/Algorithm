package 중급0314시작.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 보물_clear {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] a = new int[n];
		int[] b = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(a);
		Arrays.sort(b);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = b.length - 1; j >= 0; j--) {
				if (i + j == n - 1) {
					sum += a[i] * b[j];
				}
			}
		}
		System.out.println(sum);
	}
}
