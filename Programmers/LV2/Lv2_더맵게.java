package programmers;

import java.util.PriorityQueue;

import boj.sol;

public class Lv2_더맵게 {

	public static void main(String[] args) {

		int[] scoville = { 1, 2, 3, 9, 10, 12 };

		int k = 7;

		System.out.println(solution(scoville, k));

	}

	public static int solution(int[] scoville, int k) {
		int answer = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int a : scoville) {
			pq.offer(a);
		}

		// pq : 1,2,3,9,10,12

		while (pq.peek() <= k) {
			if (pq.size() == 0) {
				return -1;
			}

			int a = pq.poll();
			int b = pq.poll();

			int c = a + b * 2;
			pq.offer(c);
			answer++;
		}

		return answer;
	}

}
