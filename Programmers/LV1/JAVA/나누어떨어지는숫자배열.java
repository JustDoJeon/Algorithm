package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int arr[] = { 5, 9, 7, 10 };
		int divisor = 5;

		solution(arr, divisor);

	}

	public static int[] solution(int[] arr, int divisor) {

		Arrays.sort(arr);
		List<Integer> lst1 = new ArrayList<Integer>();

		for (int item : arr) {
			if (item % divisor == 0) {
				lst1.add(item);
			}
		}

		int lstSize = lst1.size();
		if (lstSize == 0) {
			int[] answer = { -1 };
			return answer;
		}

		int[] answer = new int[lstSize];
		for (int i = 0; i < lstSize; ++i) {
			answer[i] = lst1.get(i);
		}
		return answer;
	}

}
