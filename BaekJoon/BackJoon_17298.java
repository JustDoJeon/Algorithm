package Online_Lecture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

// 오큰수  그수의 오른쪽에 있으면서 a보다 큰수 중에서 가장 왼쪽에 있는 수 
// 수가없으면 -1
/*
 * 3 5 2 7 => 5 7 7 -1
 * 
 */
// 골드 4

//결국 찾아낸 방법은 스택에 아직 오큰수를 구하지 않은 수의 인덱스를 넣는 방법을 사용한다.
//스택을 활용한 문제들은 인덱스를 넣어서 구하는 경우가 많은 것 같다
public class BackJoon_17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<Integer>();
		int[] nums = new int[size];
		int[] result = new int[size];
		String[] input = br.readLine().split(" ");

		for (int i = 0; i < size; i++) {
			nums[i] = Integer.parseInt(input[i]);
		}

		stack.push(0);

		for (int i = 1; i < size; i++) {
			while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
				result[stack.pop()] = nums[i];
			}
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			result[stack.pop()] = -1;
		}

		for (int i = 0; i < size; i++) {
			bw.write(result[i] + " ");
		}
		bw.flush();
		return;
	}

}
