package Programmers.level2;

public class 숫자표현 {

	public static void main(String[] args) {

		int n = 2;

		int answer = 0;

		int sum;

		for (int i = 1; i <= n; i++) {
			sum = 0;
			for (int j = i; j <= n; j++) {
				sum += j;
				if (sum == n) {
					answer++;
					break;
				} else if (sum > n) {
					break;
				}
			}

		}
		System.out.println(answer);

	}

}
