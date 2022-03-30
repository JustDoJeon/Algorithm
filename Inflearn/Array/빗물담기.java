package inflearn;

public class 빗물담기 {

	public static void main(String[] args) {

		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		int a = solve(height);

		System.out.println(a);

	}

	public static int solve(int[] height) {
		int len = height.length;
		// left max[]
		int[] left = new int[len];

		int max = height[0];
		left[0] = height[0];

		for (int i = 1; i < height.length; i++) {
			if (height[i] < max) {
				left[i] = max;
			} else {
				left[i] = height[i];
				max = height[i];
			}
		}
		int[] right = new int[len];
		max = height[len - 1];
		right[len - 1] = height[len - 1];
		for (int i = height.length - 2; i >= 0; i--) {
			if (height[i] < max) {
				right[i] = max;
			} else {
				right[i] = height[i];
				max = height[i];
			}
		}
		int result = 0;
		// 3.min() - height
		for (int i = 0; i < height.length; i++) {
			result += Math.min(left[i], right[i]) - height[i];
		}

		return result;
	}

}
