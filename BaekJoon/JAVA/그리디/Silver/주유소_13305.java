package BOJ.Greedy.silver;

import java.util.Scanner;

public class 주유소_13305 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] distance = new long[n - 1]; // 거리
		long[] cost = new long[n]; // 비용

		for (int i = 0; i < n - 1; i++) {
			distance[i] = sc.nextLong();
		}

		for (int i = 0; i < n; i++) {
			cost[i] = sc.nextLong();
		}

		long sum = 0;
		long minCost = cost[0]; // 이전까지 과정 중 주유 최소 비용

		for (int i = 0; i < n - 1; i++) {
			if (cost[i] < minCost) {
				minCost = cost[i];
			}

			sum += (minCost * distance[i]);

		}

		System.out.println(sum);

	}
}
