package 단계별.브루트포스;

import java.util.Arrays;
import java.util.Scanner;

public class S5_덩치 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			int rank = 1;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
						rank++;
					}
				}
			}
			result[i] = rank;
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(result[i]+" ");
		}

	}

}
