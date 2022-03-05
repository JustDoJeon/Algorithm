package prac.part1;

import java.util.Scanner;

public class 이진수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			String a = Integer.toBinaryString(n);

			StringBuilder sb = new StringBuilder(a).reverse();

			for (int j = 0; j < sb.length(); j++) {
				if (sb.charAt(j) == '1') {
					System.out.print(j + " ");
				}
			}
		}

	}

}
