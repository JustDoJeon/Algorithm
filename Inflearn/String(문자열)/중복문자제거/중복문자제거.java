package String_Ex;

import java.util.Scanner;

/**
 * @author dohyun
 * 
 *         소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요. 중복이 제거된 문자열의 각
 *         문자는 원래 문자열의 순서를 유지합니다.
 * 
 */

class Solution5 {
	public String solution5(String str) {
		String answer = "";
		// 자기 위치와 자기랑 같은 문자의 위치가 다르다?? 그러면 제거하는 아주똑똑한방법이 있었다.
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

		System.out.println("==정답==");

		System.out.print(t.solution5(str));

	}

}
