package String_Ex;

import java.util.Scanner;

/**
 * @author dohyun
 * 
 *         �ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���. �ߺ��� ���ŵ� ���ڿ��� ��
 *         ���ڴ� ���� ���ڿ��� ������ �����մϴ�.
 * 
 */

class Solution5 {
	public String solution5(String str) {
		String answer = "";
		// �ڱ� ��ġ�� �ڱ�� ���� ������ ��ġ�� �ٸ���?? �׷��� �����ϴ� ���ֶȶ��ѹ���� �־���.
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			if (str.charAt(i) == str.indexOf(str.indexOf(i))) {
				answer += str.charAt(i);
				System.out.println(answer);
			}
		}

		return answer;

	}

	public static void main(String[] args) {
		Solution5 t = new Solution5();

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println("==����==");

		System.out.print(t.solution5(str));

	}

}
