package 단계별.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S3_통계학 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[8001];

		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 10000;
		int mode = 10000;

		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
			arr[value + 4000]++;

			if (max < value) {
				max = value;
			}

			if (min > value) {
				min = value;
			}
		}
		
		
		//순회
		int count = 0;
		int mode_max = 0;
		
		boolean flag = false;
		
		
		for(int i= min+4000; i<=max+4000; i++) {
			if(arr[i] > 0) { // 중앙값찾기 누적횟수가 전체 길이의 절반에 못 미친다면?
				if(count < (n+1)/2) {
					count+= arr[i]; // i값의 빈도수를 count 에 누적
				}
			}
		}
		

	}

}
