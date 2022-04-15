package 단계별.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class S5_수정렬하기3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[10001];

		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		br.close();

		for(int i=0; i<10001; i++) {
			while(arr[i] >0) {
				sb.append(i).append('\n');
				arr[i]--;
			}
		}

		System.out.println(sb);

	}

}
