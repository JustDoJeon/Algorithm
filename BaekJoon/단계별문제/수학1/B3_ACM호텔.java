package 단계별.수학1;

import java.util.Scanner;

public class B3_ACM호텔 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		while (tc-- > 0) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int k = sc.nextInt();

			int floor = 0;
			if (k % h == 0) {
				floor = h * 100;
			} else {
				floor = (k % h) * 100;
			}

			int ho = 0;
			if (k % h == 0) {
				ho = k / h;
			} else {
				ho = k / h + 1;
			}
			
			System.out.println(floor+ho);

		}

	}

}
