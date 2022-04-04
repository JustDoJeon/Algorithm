package BaekJoon.단계별풀기.브루트포스;

import java.util.Scanner;

public class B2_분해합 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 0;
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = i;
			int sum = 0;

			while (number != 0) {
				sum += number % 10;
				number = number / 10;
			}

			if (sum + i == n) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
