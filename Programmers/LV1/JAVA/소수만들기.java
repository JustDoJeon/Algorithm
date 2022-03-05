package Programmers.level1;

public class 소수만들기 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 7, 6, 4 };

		System.out.println("답은 : " + solution(nums));
	}

	public static int solution(int[] nums) {
		int answer = 0;

		for (int i = 0; i < nums.length - 2; i++) {
			System.out.println("i = " + i);
			for (int j = i + 1; j < nums.length - 1; j++) {
				System.out.println("j = " + j);
				for (int k = j + 1; k < nums.length; k++) {
					System.out.println("k : " + k);
					int sum = nums[i] + nums[j] + nums[k];
					System.out.println("sum =========== > " + sum);
					if (Check(sum)) {
						System.out.println("소수인 sum : " + sum);
						answer++;
					} else {
						continue;
					}
				}
			}
		}

		return answer;
	}

	public static boolean Check(int n) {
		int sum = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				sum++;
			}
		}

		if (sum >= 1) {
			return false;
		} else {
			return true;
		}
	}

}
