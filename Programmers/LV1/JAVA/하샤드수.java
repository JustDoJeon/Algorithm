package Programmers.level1;

public class 하샤드수 {

	public static void main(String[] args) {

		System.out.println(solve(10));

	}

	public static boolean solve(int x) {
		boolean answer = true;

		String str = String.valueOf(x);

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			int a = str.charAt(i) - 48;
			sum += a;
		}

		if (x % sum == 0) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}

}
