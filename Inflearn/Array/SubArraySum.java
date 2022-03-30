package inflearn;

import java.util.ArrayList;

public class SubArraySum {

	public static void main(String[] args) {

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int a = solve(nums);
		System.out.println(a);
	}

	public static int solve(int[] nums) {
		int curMax = nums[0]; // -2
		int allMax = nums[0]; // -2

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < nums.length; i++) {
			// i= 1, cur = -2+1, 1 => 1
			// all = 1,-2 = > 1 그럼 전에거 버림
			// i =2 1+-3 , 1 -> 1
			curMax = Math.max(nums[i], curMax + nums[i]);
			allMax = Math.max(allMax, curMax);

		}

		return allMax;
	}
}
