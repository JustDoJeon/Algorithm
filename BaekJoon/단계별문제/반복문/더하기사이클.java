package BaekJoon.단계별풀기.반복문;

import java.util.Scanner;

public class 더하기사이클 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 0;
		int target = n;
		
		if(n==0) {
			System.out.println("1");
			System.exit(0);
		}

		while (true) {

			int a = (target % 10) * 10;
			int b = ((target / 10) + (target % 10)) % 10; // 2
			target = a + b;
			cnt++;

			if (n == target) {
				break;
			}
			

		}
		System.out.println(cnt);
	}

}
