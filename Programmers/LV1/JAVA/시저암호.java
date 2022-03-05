package Programmers.level1;

public class 시저암호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a~ 97부터 122
		// A65~90
		String s = "aB Z";
		int n = 4;
		String answer = "";
//		System.out.println((int) 'z');

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				answer += ch;
				continue;
			}
			if (ch >= 'a' && ch <= 'z') {
				if (ch +n> 'z') {
					answer += (char) (ch - 26 + n);
				} else {
					answer += (char) (ch + n);
				}
			} else if (ch >= 'A' && ch <= 'Z') {
				if (ch +n> 'Z') {
					answer += (char) (ch - 26 + n);
				} else {
					answer += (char) (ch + n);
				}
			}

		}
		System.out.println(answer);
	}
}