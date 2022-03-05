package Programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순 {

	public static void main(String[] args) {
		long n = 118372;
		solution(n);
	}

	public static long solution(long n) {
		long answer = 0;

		String str = Long.toString(n);

		String[] arrStr = str.split("");

		Arrays.sort(arrStr, Collections.reverseOrder());

		str = String.join("", arrStr);

		System.out.println(str);

		answer = Long.parseLong(str);

		return answer;

	}

}
