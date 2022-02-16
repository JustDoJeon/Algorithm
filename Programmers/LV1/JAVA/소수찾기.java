package Programmers.level1;

public class 소수찾기 {

	public static void main(String[] args) {

		int n = 10;

		int answer = 0;

		int[] numbers = new int[n + 1];

		for (int i = 2; i <= n; i++) {
			numbers[i] = i;
		}

		for (int i = 2; i <= n; i++) {
			if (numbers[i] == 0)
				continue;

			for (int j = 2 * i; j <= n; j += i) {
				numbers[j] = 0;
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 0) {
				answer += 1;
			}
		}
		System.out.println(answer);

	}

}
