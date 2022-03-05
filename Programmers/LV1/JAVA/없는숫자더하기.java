package Programmers.level1;

import java.util.HashMap;

public class 없는숫자더하기 {

	public static void main(String[] args) {

		int[] numbers = { 5, 8, 4, 0, 6, 7, 9 };

		System.out.println(solution(numbers));

	}

	public static int solution(int[] numbers) {
		int answer = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i <= 9; i++) {
			map.put(i, 0);
		}

		for (int a : numbers) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}

		for (int i = 0; i < map.size(); i++) {
			if (map.get(i) == 0) {
				answer += i;
			}

		}
		return answer;
	}
}
