package BaekJoon.단계별풀기.반복문;

import java.io.IOException;
import java.util.Scanner;

public class 숫자의개수 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int[] digit = new int[10];

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int num = A * B * C;
		String str = num + "";
		for (int i = 0; i < str.length(); i++) {
			digit[str.charAt(i) - '0']++;
		}

		for (int i = 0; i < digit.length; i++) {
			System.out.println(digit[i]);
		}

	}

}