package DP;

import java.util.Scanner;

public class BaekJoon_2748 {
	static int n;
	static long[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = new long[91];
		n = sc.nextInt();
		fibo(n);

	}

	public static void fibo(int n) {
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println(arr[n]);
		
	}

}
