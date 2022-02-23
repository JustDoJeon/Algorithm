package BOJ.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 욱제는효도쟁이_14487 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;

		for (int i : arr) {
			sum += i;
		}
// 
//		sum = Math.min(sum - arr[0], sum - arr[n - 1]);

		Arrays.sort(arr);

		int total = 0;
		total = sum - arr[n - 1];

		System.out.println(total);
	}

}
