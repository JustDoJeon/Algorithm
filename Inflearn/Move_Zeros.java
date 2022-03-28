package Inflearn.Sorting_Search;

import java.util.Arrays;

public class Move_Zeros {

	public static void main(String[] args) {

		int[] nums = { 0, 3, 2, 0, 8, 5 };
		Solve(nums);
	}

	public static int[] mySolve(int[] nums) {
		int[] answer = new int[nums.length];
		Arrays.fill(answer, 0);
		int idx = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				answer[idx] = nums[i];
				idx++;
			}
		}

		for (int ans : answer) {
			System.out.print(ans + " ");
		}

		return answer;

	}

	public static int[] Solve(int[] nums) {
		int index = 0;
		int n = nums.length; // index -1
		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				nums[index] = nums[i];
				index++;
			}
		}

		while (index < n) {
			nums[index] = 0;
			index++;
		}

		for (int a : nums) {
			System.out.println(a);
		}

		return nums;
	}

}
