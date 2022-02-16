package Programmers.level1;

public class 문자열내p와y의개수 {

	public static void main(String[] args) {
		String s = "pPoooyY";

		System.out.println(check(s));
	}

	public static boolean check(String s) {

		s = s.toLowerCase();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'p')
				count++;
			else if (s.charAt(i) == 'y')
				count--;
		}

		if (count == 0)
			return true;
		else
			return false;
	}
}
