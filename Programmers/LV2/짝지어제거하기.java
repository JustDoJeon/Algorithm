package 프로그래머스.LV2;

import java.util.Stack;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		String s = "cdcd";
		// String s = "cdcd";

		System.out.println(solution(s));
	}

	public static int solution(String s) {
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (st.isEmpty()) {
				st.push(s.charAt(i));
			} else {
				if (st.peek().equals(s.charAt(i))) {
					st.pop();
				} else {
					st.push(s.charAt(i));
				}
			}

		}

		if (st.isEmpty()) {
			return 1;
		} else {
			return 0;
		}

	}

}
