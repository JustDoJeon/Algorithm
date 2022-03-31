package BaekJoon.단계별풀기.문자열;

import java.util.Scanner;

public class S5_그룹단어체커 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n-- > 0) {
			String str = sc.next();
			boolean check  = true;
			boolean[] flag = new boolean[26];
			for (int i = 0; i < str.length() - 1; i++) {

				if (flag[str.charAt(i) - 97]) {
					check = false;
					break;
				}
				if (str.charAt(i) != str.charAt(i + 1)) {
					flag[str.charAt(i) - 97] = true;
				}
			}
		}

	}

}
