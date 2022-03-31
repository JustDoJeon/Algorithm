package BaekJoon.단계별풀기.문자열;

import java.util.HashMap;
import java.util.Scanner;

public class B1_단어공부 {

	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		// 0- >A ,1 -> B
		int[] alpha = new int[26];
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		str = str.toUpperCase();

		for (int i = 0; i < str.length(); i++) {
			alpha[str.charAt(i) - 'A']++;
		}
		// 위치 찾기
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for (int i = 0; i < 26; i++) {
			if (alpha[i] > max) {
				max = alpha[i];
				idx = i;
			}
		}
		int cnt = 0;
		for (int i = 0; i < 26; i++) {
			if (max == alpha[i]) {
				cnt++;
			}
		}
		if (cnt >= 2) {
			System.out.println("?");
		} else {
			System.out.println((char) (idx + 65));
		}
	}

}
