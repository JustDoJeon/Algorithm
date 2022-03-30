package inflearn;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 2, 8, 11, 14 };
		int target = 16;

		int[] ans = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					ans[0] = i+1;
					ans[1] = j+1;
				}
			}
		}
		
		System.out.println(ans[0]+" " + ans[1]);
		

	}

}
