package Online_Lecture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BackJoon_17299 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = Integer.parseInt(br.readLine());

		// nums : 1 1 2 3 4 2 1

		String[] input = br.readLine().split(" ");

		int[] nums = new int[size];

		int[] freq = new int[1000001];

		int[] result = new int[size];

		Stack<Integer> stack = new Stack<Integer>();
		// freq 배열에 빈도수 체크 하기
		/*
		 * freq[] 0 1 2 3 4 5 6 0 3 2 1 1 0 0
		 */
		for (int i = 0; i < size; i++) {
			nums[i] = Integer.parseInt(input[i]);
			freq[nums[i]]++;
		}

		stack.push(0);

		for (int i = 1; i < size; i++) {

			if (stack.isEmpty()) {
				stack.push(i);
			}
			while (!stack.isEmpty() && freq[nums[i]] > freq[nums[stack.peek()]]) {
				result[stack.pop()] = nums[i];
			}
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			result[stack.pop()] = -1;
		}

		for (int i = 0; i < size; i++) {
			bw.write(String.valueOf(result[i] + " "));
		}
		
		bw.write("\n");
		bw.flush();
		bw.close();

	}
}
