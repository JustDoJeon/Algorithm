package BaekJoon.단계별풀기.조건문;

import java.util.Scanner;

public class 오븐시계 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		int time = sc.nextInt();

		if (M + time > 60) {
			H = H + (M + time) / 60;
			M = ((M + time) % 60);
		} else if (M + time == 60) {
			H = H + 1;
			M = 0;
		} else {
			M = M + time;
		}
		if (H >= 24) {
			H = H-24;
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + M);
		}

	}
}
