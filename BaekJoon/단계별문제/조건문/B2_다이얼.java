package BaekJoon.단계별풀기.문자열;

import java.util.Scanner;

public class B2_다이얼 {
	public static void main(String[] args) {
		String[] dial = { "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };

		Scanner sc = new Scanner(System.in);

		String str = sc.next(); // WA

		int time = 0;
		for (int t = 0; t < str.length(); t++) {
			for (int i = 0; i < dial.length; i++) {
				for (int j = 0; j < dial[i].length(); j++) {
					if (str.charAt(t) == dial[i].charAt(j)) {
						time += i + 2;
					}
				}
			}
		}
		
		System.out.println(time);
	}

}
