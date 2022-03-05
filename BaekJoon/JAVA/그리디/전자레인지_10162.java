package BOJ.Greedy;

import java.util.Scanner;

public class 전자레인지_10162 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int A = 0;
		int B = 0;
		int C = 0;
		int answer = 0;
		// A 5*60 300초
		// B 60초
		// C 10초

		if (T >= 300) {
			A = T / 300;
			T = T - A * 300;
		}
		if (T >= 60) {
			B = T / 60;
			T = T - B * 60;
		}
		if (T % 10 != 0) {
			System.out.println(-1);
			System.exit(0);
		} else {
			C = T / 10;
			System.out.println(A + " " + B + " " + C);
		}

	}

}
