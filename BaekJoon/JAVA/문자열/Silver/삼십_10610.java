package BOJ.Greedy.silver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//실버5
public class 삼십_10610 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		String str = sc.next();

		char[] arr = str.toCharArray();

		Arrays.sort(arr);

		int len = arr.length;

		StringBuilder sb = new StringBuilder();

		for (int i = len - 1; i >= 0; i--) {
			int num = arr[i] - '0';
			sum += num;
			sb.append(num);
		}

		if (sum % 3 != 0 || arr[0] != '0') {
			System.out.println(-1);
		} else {
			System.out.println(sb.toString());
		}
	}

}
