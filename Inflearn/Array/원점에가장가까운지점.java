package Inflearn.Sorting_Search;

import java.util.PriorityQueue;

public class 원점에가장가까운지점 {
//원점에서 가장가까운 좌표 k개 리턴 
	public static void main(String[] args) {

		int[][] points = { { 1, 3 }, { -2, 2 } };
		int k = 1;
		int[][] ans = solve(points, k);
		for(int[] a : ans) {
			System.out.println(a);
		}
	}

	public static int[][] solve(int[][] points, int k) {
		// 오름차순
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
				(a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));

		// 내림차순
		PriorityQueue<int[]> pq2 = new PriorityQueue<int[]>(
				(a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));

		int[][] answer = new int[points.length][2];
		for (int[] point : points) {
			pq.offer(point);
			int index = 0;
			while (index < k) {
				answer[index] = pq.poll();
				index++;
			}
//			pq2.add(point);
		}

//		System.out.println(pq);
//		System.out.println(pq2);

		return answer;
	}

}
