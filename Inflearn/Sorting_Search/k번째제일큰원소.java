package Inflearn.Sorting_Search;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class k번째제일큰원소 {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };

		int k = 4;
		System.out.println(solve2(nums, k));
	}

	public static int solve(int[] nums, int k) {
		int answer = 0;

		int len = nums.length;

		Arrays.sort(nums);

		answer = nums[len - k];

		return answer;

	}

	// Heap을 이용한 문제
	public static int solve2(int[] nums, int k) {
		int answer = 0;

		Queue<Integer> pq = new PriorityQueue<Integer>();

		for (int i : nums) {
			pq.offer(i);
			if (pq.size() > k) {
				pq.poll();
			}
		}

		answer = pq.peek();

		return answer;
	}

}
