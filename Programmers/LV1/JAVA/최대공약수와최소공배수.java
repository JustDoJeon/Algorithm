package Programmers.level1;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {

		int n = 3;
		int m = 12;
		solution(n, m);
	}

	public static int[] solution(int n, int m) {
		int[] answer = {1,2};

		int big = Math.max(n, m);
		int small = Math.min(m, n);

		answer[0] = gcd(big, small);
		answer[1] = big * small / answer[0];

		return answer;
	}

	public static int gcd(int big, int small) {
		if (big % small == 0) {
			return small;
		} else {
			return gcd(small, big % small);
		}
	}

}
