package String_Ex;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dohyun
 * 
 *         /* ���� : ���ĺ��� ����� ���ڿ��� ����մϴ�
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
			// ���ĺ����� �˼��ִ°� Character Ŭ������ �޼ҵ� ���!
			if (!Character.isAlphabetic(s[lt])) {
				lt++; // ���ĺ��� �ƴҶ� lt�� 1����
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

		System.out.println("==����==");

		System.out.println(t.solution(str));

	}

}
