package String_Ex;

import java.util.Scanner;

public class Solution1_2 {

	public static void main(String[] args) {
		Main t = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println("Á¤´äÀº?");
		System.out.println(t.solution(str));

	}

}

class Main {
	public String solution(String str) {
		String answer = "";

		int m = Integer.MIN_VALUE;

		String[] strArr = str.split(" ");
		for (String x : strArr) {
//			System.out.println(x);
			int len = x.length();
			if (len > m) {
				m = len;
				answer = x;
			}
		}
		return answer;
	}

}
