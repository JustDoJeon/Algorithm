package Inflearn.Sorting_Search;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 미팅룸2 {

	public static void main(String[] args) {

		int[][] intervals = { { 5, 10 }, { 16, 20 }, { 0, 30 } };

		int ans = solution(intervals);
		System.out.println(ans);
	}

	public static int solve(int[][] intervals) {
		int answer = 1;

		Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // 오름차순

		int end = intervals[0][1];
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] > end) {
				answer++;
			}
			end = intervals[i][1];
		}

		return answer;
	}

	// 인강 정답
	public static int solution(int[][] intervals) {
		if (intervals.length == 0 || intervals == null) {
			return 0;
		}
		// 1
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // 오름차순

		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->a[1]-b[1]); //엔드타임 오름차순 관리
// 0 30  5 10 16 20
		// 2.for pq
		for (int[] arr : intervals) {
			if (pq.isEmpty()) {
				pq.offer(arr); // 0 30 , 5 10  16 20 
			} else {
				if (pq.peek()[1] <= arr[0]) {
					pq.poll(); // 전에있던방 쓰겠다는 느낌
				}
				pq.offer(arr);
			}
		}

		return pq.size();
	}

}
