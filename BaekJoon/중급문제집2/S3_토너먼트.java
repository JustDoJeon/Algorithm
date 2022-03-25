package 중급2.day3;

import java.util.Scanner;

public class S3_토너먼트 {
	public static void main(String[] args) {

		/**
		 * 8명 1 2 3 4 5 6 7 8
		 * 
		 * 7명 1 2 3 4 5 6 7
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w1 = sc.nextInt();
		int w2 = sc.nextInt();
		int round = 0;

		while (w1 != w2) {
			w1 = w1 / 2 + w1 % 2;
			w2 = w2 / 2 + w2 % 2;
			round++;
		}
		
		System.out.println(round);

	}

}
