package Inflearn.QueueStack;

import java.util.Scanner;
import java.util.Stack;

public class 유효한괄호 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean ans = true;
		String s = sc.next();
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else if (ch == ')' && !st.isEmpty() && st.peek() == '(') {
				st.pop();
			} else if (ch == ']' && !st.isEmpty() && st.peek() == '[') {
				st.pop();
			} else if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
				st.pop();
			} else {
				ans = false;
			}

		}
		if (st.isEmpty()) {
			ans = true;
		}
		System.out.println(ans);

	}

}
