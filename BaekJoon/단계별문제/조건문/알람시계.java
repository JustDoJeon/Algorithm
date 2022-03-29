package BaekJoon.단계별풀기.조건문;

import java.util.Scanner;

public class 알람시계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		// 힌트 45분 일찍 알람 설정하기
		if (M - 45 < 0) {
			if (H == 0) {
				H = 23;
				M = 60-(45-M);
			}else {
				H = H-1;
				M = 60-(45-M);
			}
		}else {
			M = M-45;
		}
		System.out.println(H + " " + M);
	}
}
