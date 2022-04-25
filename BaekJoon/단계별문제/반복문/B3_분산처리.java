package 오늘의문제;

import java.util.Scanner;

public class B3_분산처리 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int data = 1;
			for (int j = 1; j <= b; j++) {
				data = (data * a) % 10;
			}

			if (data == 0) {
				data = 10;
			}

			System.out.println(data);
		}
	}
}
