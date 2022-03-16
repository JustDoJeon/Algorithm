package 중급0314시작.day3;

import java.util.Scanner;

public class B4_손익분기점_CLEAR {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();

		int B = sc.nextInt();

		int C = sc.nextInt();

		int answer = 0;

		if (C <= B) {
			System.out.println("-1");
		} else {
			System.out.println((A / (C - B)) + 1);
		}

	}

}
