package Inflearn.Sorting_Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

// intervals 배열이 주어지면 겹치는 구간을 병합하여 배열을 반환한다.
public class interval병합_다시 {
	public static void main(String[] args) {

		int[][] intervals = { { 1, 4 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };

		int[][] ans = solve(intervals);

	}

	private static int[][] solve(int[][] intervals) {
		ArrayList<int[]> list = new ArrayList<int[]>();
		if (intervals.length == 0 || intervals == null) {
			return list.toArray(new int[0][]);
		}

		// 1 4 2 6 8 10 15 18
		// 1.소트
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		// 2.
		int start = intervals[0][0]; // 1
		int end = intervals[0][1]; // 4

		for (int i = 1; i < intervals.length; i++) {
			if (end >= intervals[i][0]) {
				end = Math.max(end, intervals[i][1]);
				// 2,6 -> 1, 6
			} else {
				list.add(new int[] { start, end });
				start = intervals[i][0];
				end = intervals[i][1];
			}
		}
		list.add(new int[] {start,end});

		
		return list.toArray(new int[list.size()][]);
	}

}
