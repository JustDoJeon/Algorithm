package BaekJoon.단계별풀기.문자열;

import java.util.Arrays;
import java.util.Scanner;

public class B2_알파벳 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int[] arr = new int[26];

		Arrays.fill(arr, -1);

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i) - 'a'] != -1) {
				continue;
			}
			arr[str.charAt(i) - 'a'] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
