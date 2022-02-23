package BOJ.Greedy;

import java.util.Scanner;

public class 한조서열정리하고옴_14659 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					sum++;
					total = Math.max(sum, total);
				}
				if (arr[i] < arr[j]) {
					break;
				}
			}
		}

		System.out.println(total);

	}

}
