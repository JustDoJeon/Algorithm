package String_Ex;

import java.util.Scanner;

/**
 * @author wjseh
 *			회문 문자열 문제
 *         대칭형 문자인지 아닌지 확인하는 문자 (대소문자 구분 NO) 
 *         
 *         방법 1 직관적인 방법
 *         방법 2 StringBuilder 사용
 */
public class Solution7 {

	public static void main(String[] args) {

		String answer = "NO";

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		/*
		 * 방법 1 str = str.toUpperCase();
		 * 
		 * int lt = 0; int rt = str.length() - 1;
		 * 
		 * int len = str.length();
		 * 
		 * for (int i = 0; i < len / 2; i++) { if (str.charAt(i) != str.charAt(len - i -
		 * 1)) { answer = "NO"; } if (str.charAt(i) == str.charAt(len - i - 1)) { answer
		 * = "YES"; } }
		 * 
		 * 
		 * }
		 * 
		 */

		// 방법 2

		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(tmp)) {
			answer = "YES";
		}
		
		System.out.println(answer);
	}
}
