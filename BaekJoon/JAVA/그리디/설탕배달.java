package BOJ.Greedy;

import java.util.Scanner;

public class 설탕배달 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		solve(n);
	}

	public static void solve(int n) {
		int ans = 0;

		while (true) {

			if (n % 5 == 0) {
				ans += n / 5;
				System.out.println(ans);
				break;
			} else {
				n -= 3;
				ans++;
			}

			if (n < 0) {
				System.out.println("-1");
				break;
			}

		}

	}
}
