package 단계별.수학1;

import java.util.Scanner;

public class B4_손익분기점 {

	public static void main(String[] args) {
		long answer = -1;

		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long i = 0;

		if (b / c > 0) {
			answer = -1;
			System.out.println(answer);
			System.exit(0);
		}
		while (true) {
			if (a + b * i < c * i) {
				answer = i;
				break;
			} else {
				i++;
			}

		}

		System.out.println(answer);
	}

}
