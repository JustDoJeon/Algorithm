package Programmers.level1;

public class 부족한금액계산하기 {

	public static void main(String[] args) {
		long answer = 0L;

		int price = 3;
		int money = 20;
		int count = 4;

		System.out.println(solution(price, money, count));

	}

	public static long solution(int price, int money, int count) {
		long answer = 0L;

		for (int i = 1; i <= count; i++) {
			answer += price * i;
		}

		if (money >= answer) {
			return 0;
		} else {
			return answer - money;
		}

	}

}
