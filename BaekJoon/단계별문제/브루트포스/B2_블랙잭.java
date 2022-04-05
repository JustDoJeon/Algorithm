package BaekJoon.단계별풀기.브루트포스;

import java.util.ArrayList;
import java.util.Scanner;

public class B2_블랙잭 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 카드의 갯수
		int m = sc.nextInt(); // 이걸 넘으면안됨

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int answer = search(arr, n, m);
		
		System.out.println(answer);
	}

	public static int search(int[] arr, int n, int m) {
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					int temp = arr[i] + arr[j] + arr[k];

					if (m == temp) {
						return temp;
					}

					if (result < temp && temp < m) {
						result = temp;
					}
				}
			}
		}

		return result;
	}

}
