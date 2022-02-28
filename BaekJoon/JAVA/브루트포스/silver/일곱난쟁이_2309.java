package BOJ.BruteForce.silver;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이_2309 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		int target = sum - 100;

		Arrays.sort(arr);
		int ansA = 0;
		int ansB = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					ansA = arr[i];
					ansB = arr[j];
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ansA || arr[i] == ansB) {
				continue;
			} else {
				System.out.println(arr[i]);
			}
		}

	}

}
