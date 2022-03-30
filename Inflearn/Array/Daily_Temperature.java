package StringArrayAgain;

import java.util.Stack;

public class Daily_Temperature_Again {

	public static void main(String[] args) {

		int[] nums = { 73, 74, 75, 71, 69, 72, 76, 73 };
		// 0 1 2 3 4 5 6 7
		Stack<Integer> st = new Stack<Integer>();

		int result[] = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
				int index = st.pop();
				result[index] = i - index;

			}
			st.push(i);
		}

		for(int a :result) {
			System.out.print(a + " ");
		}
	}
}



import java.util.Stack;

class Solution {
    public int[] solution(int[] price) {
        int[] answer = new int[price.length];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0; i<price.length; i++){
            while(!st.isEmpty() && price[st.peek()] < price[i]){
                int index = st.pop();
                answer[index ] = i-index;
        }
        st.push(i);
            }
        
        for(int i=0; i<answer.length; i++ ){
            if (answer[i] == 0){
                answer[i] = -1;
        }
        }
        
        
        
        return answer;
    }
}