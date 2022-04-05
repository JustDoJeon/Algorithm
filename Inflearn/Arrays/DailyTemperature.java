package Inflearn.Arrays;

import java.util.Stack;

public class DailyTemperature {

	public static void main(String[] args) {

		int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };

		int[] answer = solve2(temperatures);
		for (int a : answer) {
			System.out.print(a + " ");
		}
	}

	public static int[] mySolve(int[] temperatures) {
		int len = temperatures.length;
		int[] res = new int[len];
		for (int i = 0; i < len; i++) {
			boolean flag = false;
			for (int j = i + 1; j < len; j++) {
				if (temperatures[i] < temperatures[j]) {
					flag = true;
					res[i] = j - i;
					break;
				}
			}
			if (!flag) {
				res[i] = 0;
			}
		}

		return res;
	}

	public static int[] solve1(int[] temperatures) {
		int len = temperatures.length;
		int[] result = new int[len];
		int count = 0;
		int j;

		for (int i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				if (temperatures[i] < temperatures[j]) {
					count++;
					break;
				} else {
					count++;
				}
			}
			if (j == len) {
				result[i] = 0;
			} else {
				result[i] = count;
			}
			count = 0;
		}

		return result;
	}

	public static int[] solve2(int[] temperatures) {
		int len = temperatures.length;
		int[] result = new int[len];
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < len; i++) {
			while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
				int idx = st.pop(); // 스택의 인덱스
				result[idx] = i - idx;
			}
			st.push(i);
		}
		return result;

	}
}
