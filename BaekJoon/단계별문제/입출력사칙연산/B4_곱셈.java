package BaekJoon.단계별풀기.입출력사칙연산;

import java.util.Scanner;

public class B4_곱셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int condition1 = (b % 10);
		int condition2 = (b % 100 - condition1)/10;
		int condition3 = b/100;

		System.out.println(a*condition1);
		System.out.println(a*condition2);
		System.out.println(a*condition3);
		System.out.println(a*b);
		
	}

}
