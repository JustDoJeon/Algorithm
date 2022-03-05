package BOJ.Greedy;

import java.util.Scanner;

public class 세탁소사장동혁_2720 {

	public static void main(String[] args) {

		/*
		 * 25센트 쿼터 10센트 다임 5센트 니켈 1센트
		 */

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		int quarter = 0;
		int dime = 0;
		int nikkel = 0;
		int penny = 0;

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			while (n > 0) {

				if (n >= 25) {

					quarter = n / 25;

					n = n - 25 * quarter;

				}
				if (n >= 10) {
					dime = n / 10;
					n = n - 10 * dime;
				}
				if (n >= 5) {
					nikkel = n / 5;
					n = n - nikkel * 5;
				} else {
					penny = n;
					n = n - penny;
				}

			}
			System.out.println(quarter + " " + dime + " " + nikkel + " " + penny);
			;
			quarter = 0;
			dime = 0;
			nikkel = 0;
			penny = 0;
		}

	}

}
