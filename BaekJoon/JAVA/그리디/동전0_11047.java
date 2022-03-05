package BOJ.Greedy;

import java.util.Scanner;

public class 동전0_11047 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int money = sc.nextInt();

		int[] coins = new int[n];

		for (int i = 0; i < n; i++) {
			coins[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = n - 1; i >= 0; i--) {
			int cnt = 0;
			if (money >= coins[i]) {
//				System.out.println("coins[i]  : " + coins[i]);
				sum += money / coins[i];
				cnt = money / coins[i];
//				System.out.println("cnt : " + cnt);
				money = money - cnt * coins[i];
//				System.out.println("money : " + money);

			}
			if (money == 0) {
				break;
			}

		}

		System.out.println(sum);
	}

}
