package Programmers.level1;

public class s2016년 {

	public static void main(String[] args) {
		String answer = "";

		int a = 5;
		int b = 24;

		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int allDate = 0;

		for (int i = 0; i < a - 1; i++) {
			allDate += date[i];
		}

		allDate += (b - 1);
		answer = day[allDate % 7];

		System.out.println(answer);

	}

}
