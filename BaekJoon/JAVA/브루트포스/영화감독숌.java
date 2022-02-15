package Algo_Study.BruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class 영화감독숌 {

	public static void main(String[] args) {

		int answer = 0;

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(solve2(n));

	}

	// 시도했다가 포기
	public static int solve(int n) {
		int answer = 0;
		String fixSix = "666";
		String prefix = String.valueOf(n);

		if (n == 0) {
			answer = Integer.parseInt(fixSix);
		} else if (n <= 6) {
			answer = Integer.parseInt(prefix + fixSix);
		} else if (n >= 7 && n <= 9) { // 6667 6668 6669
			answer = Integer.parseInt(fixSix + prefix);
		} else if (n >= 10) // 10666 11666 12666 .... 65666 66666
			System.out.println(answer);
		return answer;
	}

	public static int solve2(int n) {
		int answer = 0;

		int fix = 666;
		int count = 1;
		System.out.println(fix+1);

		while (count != n) {
			fix++;
			if (String.valueOf(fix).contains("666")) {
				count++;
			}
		}
		// fix++가 667이 아닌 1666인 이유는??
	    // 조건문 들어올때 667 668......1666이 된다 
		return fix;
	}
}
