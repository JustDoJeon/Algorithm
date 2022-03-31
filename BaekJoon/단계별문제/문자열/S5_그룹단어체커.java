package 단계별.문자열;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class S5_그룹단어체커 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		while (n-- > 0) {
			String str = sc.next();
			Stack<Character> st = new Stack<Character>();
			boolean flag = true;
			char[] ch = str.toCharArray();
			if (str.length() == 1) {
				flag = true;
			} else {

				for (int i = 0; i < ch.length; i++) {
					if (st.isEmpty()) {
						st.push(ch[i]);
					} else {
						if (st.peek() != ch[i]) {
							if (st.contains(ch[i])) {
								flag = false;
								break;
							} else {
								st.push(ch[i]);
							}
						}
					}

				}
			}
			if (flag) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
