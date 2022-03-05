package prac.part1;

import java.util.Scanner;

public class 피보나치수5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(solution(n));

	}

	public static int solution(int n) {
		int answer = 0;

		if (n == 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		} else {
			answer = solution(n - 2) + solution(n - 1);
		}

		return answer;

	}

}
