package 단계별.수학1;

import java.util.Scanner;

public class B1_설탕배달 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		int cnt = 0;
		while (true) {
			if (k % 5 == 0) {
				cnt += k / 5;
				System.out.println(cnt);
				break;
			} else {
				k -= 3;
				cnt++;
			}

			if (k < 0) {
				System.out.println("-1");
				break;
			}

		}

	}

}
