package prac.part1;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 9;
		int[] arr = new int[9];
		int[] answer = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			int height = sc.nextInt();
			arr[i] = height;
			sum += arr[i];
		}

		System.out.println(" sum  : " + sum);
		
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					System.out.println("i : " + i +" " + "arr[i] : " + arr[i]);
					System.out.println("j : " + j +" " +" arr[j] : " + arr[j]);
					for (int k = 0; k < n; k++) {
						System.out.println(" k :  " + k);
						if (i == k || j == k) {
							continue;
						}
						System.out.println(arr[k]);
					}
				}
			}
		}
	}

}
