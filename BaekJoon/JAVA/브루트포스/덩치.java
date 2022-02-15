package Algo_Study.BruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class 덩치 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] answer = new int[n];

		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();

		}

		for (int i = 0; i < n; i++) {
			int rank = 1;
			for (int j = 0; j < n; j++) {
				if (i != j && (arr[i][0] < arr[j][0]) && (arr[i][1] < arr[j][1])) {
					rank++;
				}
				answer[i] = rank;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(answer[i] + " ");
		}

	}

	public static int solve(int[] cardList, int n, int m) {
		int answer = 0;

		return answer;
	}

}
