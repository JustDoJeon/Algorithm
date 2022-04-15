package 단계별.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S5_소트인사이드 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num = br.readLine();
		long[] arr = new long[num.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = num.charAt(i)-'0';
		}
		
		Arrays.sort(arr);
		
		String answer = "";
		for(int i=arr.length-1; i>=0; i--) {
			answer+=arr[i];
		}
		
		System.out.println(answer);

	}

}
