package inflearn;

import java.util.ArrayList;

public class 누락된범위 {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 5, 50, 75 };
		int lower = 0;
		int upper = 99;

		ArrayList<String> list = solve(nums, lower, upper);
		System.out.println(list);
	}

	public static ArrayList<String> solve(int[] nums, int lower, int upper) {
		// 1.
		ArrayList<String> result = new ArrayList<String>();

		if (nums == null || nums.length == 0) {
			return result;
		}

		// 2.
		if (lower < nums[0]) {
			result.add(makeRange(lower, nums[0] - 1));
		}

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i] + 1 && nums[i] + 1 < nums[i + 1]) {
				result.add(makeRange(nums[i] + 1, nums[i + 1] - 1));

			}
		}
		
		if(upper > nums[nums.length-1]) {
			result.add(makeRange(nums[nums.length-1]+1, upper));
		}

		return result;

	}

	private static String makeRange(int low, int high) {
		if (low == high) {
			return String.valueOf(low);
		} else {
			return String.valueOf(low + "->" + high);
		}
	}
}
