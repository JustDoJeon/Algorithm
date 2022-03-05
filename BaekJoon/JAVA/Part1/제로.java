package boj.review;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class 제로 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<Integer> st = new Stack<Integer>();

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			if (input != 0) {
				st.push(input);
			} else {
				st.pop();
			}
		}

		if (st.size() == 0) {
			System.out.println("0");
			System.exit(0);
		}

		int sum = 0;

		for (int a : st) {
			sum += a;
		}
		
		System.out.println(sum);

	}

}
