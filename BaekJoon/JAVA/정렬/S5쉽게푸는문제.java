package 중급0314시작.다시풀실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.StringTokenizer;
//1292
public class S5쉽게푸는문제 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 1 2 2 3 3 3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] list = new int[1002];
		/*
		 * 1 1
		 * 2 1+ 2 
		 * 3 1+ 2+ 2
		 * 4 1 + 2+ 2 + 3
		 * 5 1 2 2 3 3 3 4
		 */
		int count = 1;
		for(int i=1; i<1000; i++) {
			for(int j=0; j<i; j++) {
				if(count==1001)break;
				list[count] = i;
				count++;
			}
		}
		int sum = 0;
		
		for(int i = n; i<=m; i++) {
			sum+= list[i];
		}
		System.out.println(sum);
	}

}
