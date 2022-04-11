package Inflearn.QueueStack;

import java.util.Scanner;
import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {

		String[] strs = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		// 1.
		Stack<Integer> st = new Stack<Integer>();

		// 2.
		for (String op : strs) {

			switch (op) {

			case "C":
				st.pop();
				break;

			case "D":
				st.push(st.peek() * 2);
				break;
			case "+":
				int a = st.pop();
				int b = st.pop();
				st.push(b);
				st.push(a);
				st.push(a + b);
				break;
			default:
				st.push(Integer.valueOf(op));
			}
		}

		int sum = 0;
		for (int a : st) {
			sum += a;
		}

		System.out.println(sum);

	}

}
