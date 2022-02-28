package Programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최댓값과최솟값 {

	public static void main(String[] args) {
		String s = "1 2 3 4";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String answer = "";

		String[] str = s.split(" ");

		int[] arr = new int[str.length];

		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(arr);
		
		answer = arr[0] +" " + arr[arr.length-1];
		
		return answer;
	}

}
