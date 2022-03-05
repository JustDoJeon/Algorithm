package Algo_Study.BruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class 블랙잭 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] cardList = new int[n];

		for (int i = 0; i < cardList.length; i++) {
			cardList[i] = sc.nextInt();
		}

		System.out.println(solve(cardList, n, m));
	}

	public static int solve(int[] cardList, int n, int m) {
		int answer = 0;

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = cardList[i] + cardList[j] + cardList[k];
					if (m == sum) {
						return sum;
					}
					if (m > sum && answer < sum) {
						answer = sum;
					}
				}
			}
		}

		return answer;
	}

}
