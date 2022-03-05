package Programmers.level1;

import java.util.StringTokenizer;

public class 이상한문자만들기 {
	public static void main(String[] args) {
		String answer ="";
		String str = "try hello world";
		int cnt = 0;
		String[] arr = str.split("");
		
		for(String ss : arr) {
			cnt = ss.contains(" ") ? 0 : cnt + 1;
			answer += cnt %2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
		}
		
		System.out.println(answer);

	}

}
