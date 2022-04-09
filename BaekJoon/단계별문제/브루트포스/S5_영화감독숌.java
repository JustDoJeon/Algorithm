package BaekJoon.단계별풀기.브루트포스;

import java.util.Scanner;

public class S5_영화감독숌 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int number = 0;
		int cnt = 0;
		while (true) {
			number++;

			String str = Integer.toString(number);

			if (str.contains("666")) {
				cnt++;
			}

			if (cnt == n) {
				break;
			}

		}

		System.out.println(number);

	}

}
