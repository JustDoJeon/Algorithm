package Inflearn.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	static int fuck = 0;

	public static void main(String[] args) {

		int[] nums = {  8, 2, 11, 14 };

		int target = 16;
		
		solve2(nums, target);

	}

	// O(n^2)
	public static int[] solve(int[] nums, int target) {
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i + 1, j + 1 };
				}
			}
		}

		return new int[] { 0, 0 };

	}

	// O(n)
	public static int[] solve2(int[] nums, int target) {
		//1.ds
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//2. for
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(nums[i])) {
				int val = map.get(nums[i]);
				result[0] = val +1;
				result[1] = i+1;
			}else {
				map.put(target-nums[i], i); 
			}
		}
		
		System.out.println(result[0] + " " + result[1]);
		return result;
	}

}
