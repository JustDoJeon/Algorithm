package 단계별.수학1;

import java.util.Scanner;

public class B1_분수찾기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int line = 0;
		int cnt = 0;

		while (cnt < n) {
			line++;
			cnt = line * (line + 1) / 2;
		}

		if (line % 2 == 0) {
			int top = 1 + cnt - n;
			int bottom = line - (cnt - n);
			System.out.println(top + "/" + bottom);
		} else {
			int top = line - (cnt - n);
			int bottom = 1 + cnt - n;
			System.out.println(top + "/" + bottom);
		}

	}

}
