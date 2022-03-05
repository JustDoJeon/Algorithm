package Programmers.level1;

import java.util.ArrayList;

public class 약수의개수와덧셈 {

	public static void main(String[] args) {

	}

	public static int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			if (countNum(i) == true) {
				answer += i;
			} else {
				answer -= i;
			}
		}

		return answer;
	}

	public static boolean countNum(int n) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				arr.add(i);
			}
		}

		int size = 0;
		size = arr.size();

		if (size % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
