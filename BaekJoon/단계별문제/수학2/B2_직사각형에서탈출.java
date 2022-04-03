package 단계별.수학2;

import java.util.Scanner;

public class B2_직사각형에서탈출 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int answer = 0;

		int a = Math.min(h - y, y);
		int b = Math.min(w - x, x);
		
		answer = Math.min(a, b);
		System.out.println(answer);
	}

}
