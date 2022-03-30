package Inflearn.Sorting_Search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 미팅룸 {

	public static void main(String[] args) {

		int[][] intervals = { { 5, 10 }, { 16, 20 }, { 0, 30 } };

		boolean ans = solve(intervals);
		System.out.println(ans);
	}

	// 내가 시도
	public static boolean solve(int[][] intervals) {

		Arrays.sort(intervals, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}

		});

		boolean flag = true;

		for (int i = 0; i < intervals.length - 1; i++) {
			int start = intervals[i][0];
			int end = intervals[i][1];
			int nextStart = intervals[i + 1][0];
			if (nextStart < end) {
				flag = false;
			}
		}

		return flag;

	}

	// 인강 정답
	public static boolean solution(int[][] intervals) {
		if (intervals == null || intervals.length == 0) {
			return true;
		}

		// 1.sorting
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // 시작시간 기준 오름차순

		// 2.for
		int end = intervals[0][1];
		for (int i = 1; i < intervals.length; i++) {
			int start = intervals[i][0];
			if (start < end) {
				return false;
			}
			end = intervals[i][1];
		}

		return true;

	}

}
