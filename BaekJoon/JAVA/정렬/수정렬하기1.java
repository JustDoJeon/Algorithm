package Algo_Study.Sort;

import java.util.Scanner;

public class 수정렬하기1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sort(arr);

		// Arrays.sort(arr);
//		for (int i = 0; i < n; i++) {
//			System.out.println(arr[i]);
//		}
	}

	public static void sort(int[] arr) {

		// 5 2 3 4 1
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
