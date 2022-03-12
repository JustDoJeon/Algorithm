package Inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interval병합 {

	public static void main(String[] args) {

		int[][] intervals = { { 2, 6 }, { 1, 4 }, { 8, 10 }, { 15, 18 } };

		solv(intervals);

	}

	public static int[][] solv(int[][] intervals) {
		List<int[]> res = new ArrayList<int[]>();
		if (intervals.length == 0 || intervals == null) {
			return res.toArray(new int[0][]);
		}

		// DS
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		// for while
		int start = intervals[0][0];
		int end = intervals[0][1];
		// 1 4 2 6 8 10 15 18
		// start = 1 end = 4
		for (int i = 1; i < intervals.length; i++) {
			if (end >= intervals[i][0]) {
				end = Math.max(end, intervals[i][1]);
				// 2,6 => 1,6
			} else {
				res.add(new int[] { start, end });
				start = intervals[i][0];
				end = intervals[i][1];
			}
			res.add(new int[] { start, end }); // 15,18
		}

		return res.toArray(new int[res.size()][]);

	}

}
