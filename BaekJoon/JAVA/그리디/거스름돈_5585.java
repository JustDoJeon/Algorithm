package BOJ.Greedy;

import java.util.Scanner;

public class 거스름돈_5585 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int money = 1000 - a;

		int[] coins = { 500, 100, 50, 10, 5, 1 };
		int count = 0;
		int sum = 0;
		while (money > 0) {
			for (int i = 0; i < coins.length; i++) {
				count = money / coins[i];
				money = money - (count * coins[i]);
				sum += count;

				if (money == 0) {
					break;
				}
			}

		}
		System.out.println(sum);

	}

}
