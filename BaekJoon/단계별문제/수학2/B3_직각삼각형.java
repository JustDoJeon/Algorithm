package 단계별.수학2;

import java.util.Arrays;
import java.util.Scanner;

public class B3_직각삼각형 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int[] arr = new int[3];
			arr[0] = a;
			arr[1] = b;
			arr[2] = c;
			Arrays.sort(arr);
			a = arr[0];
			b = arr[1];
			c = arr[2];
			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			a = (int) Math.pow(a, 2);
			b = (int) Math.pow(b, 2);
			c = (int) Math.pow(c, 2);
			if (a + b == c) {
				System.out.println("right");

			} else {
				System.out.println("wrong");
			}

		}

	}

}
