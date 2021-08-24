package String_Ex;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dohyun
 * 
 *         /* 설명 : 알파벳만 뒤집어서 문자열을 출력합니다
 * 
 *       
 */

class Solution4 {
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0;
		int rt = s.length - 1;

		while (lt < rt) {
			// 알파벳인지 알수있는거 Character 클래스의 메소드 사용!
			if (!Character.isAlphabetic(s[lt])) {
				lt++; // 알파벳이 아닐때 lt를 1증가
			} else if (!Character.isAlphabetic(s[rt])) {
				rt--;
			} else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}

		answer = String.valueOf(s);

		return answer;

	}

	public static void main(String[] args) {
		Solution4 t = new Solution4();

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println("==정답==");

		System.out.println(t.solution(str));

	}

}
