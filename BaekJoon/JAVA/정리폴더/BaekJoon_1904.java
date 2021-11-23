package DP;

import java.util.Scanner;

/*
 * 재료 : 1 , 00
 * n = 1
 * n= 2 11  00 2
 * n=3 111 100 00 1 3 
 * n=4 1111 1100 1001 0011 0000 5
 * n= 5 11111 11100 11001 10011 00111 00001 10000 00100 8 
 * 
 * 피보나치 성립
 * 
 */

public class BaekJoon_1904 {
	static int arr[] = new int[10000001];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;

		for (int i = 3; i < arr.length; i++) {
			arr[i] = -1;
		}

		System.out.println(dp(n));

	}

	public static int dp(int n) {
		if (arr[n] == -1) {
			arr[n] = ((dp(n - 1) + dp(n - 2))) % 15746;
		}
		return arr[n];
	}

}
