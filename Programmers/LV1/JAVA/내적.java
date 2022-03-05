package Programmers.level1;

public class 내적 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { -3, -1, 0, 2 };

		System.out.println(solution(a, b));
	}

	public static int solution(int[] a, int[] b) {
		int answer = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			answer += (a[i] * b[i]);
		}

		return answer;
	}

}
