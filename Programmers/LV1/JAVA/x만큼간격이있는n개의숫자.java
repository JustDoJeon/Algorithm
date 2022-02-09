package Programmers.level1;

public class x만큼간격이있는n개의숫자 {

	public static void main(String[] args) {

		System.out.println(solution(2, 5));

	}

	public static long[] solution(int x, int n) {

		long[] answer = new long[n];

		answer[0] = x;

		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] + x;
		}

		return answer;
	}
	
	//다른풀이
	public static long[] solution2(int x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = x * (i + 1);
		}
		return answer;
	}

}
