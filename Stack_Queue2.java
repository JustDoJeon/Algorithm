package Stack_Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//2020-08-21

public class Stack_Queue2 {

	public static void main(String[] args) {

		int[] progresses = { 93, 30, 55 };

		int[] speeds = { 1, 30, 5 };

		Solution a = new Solution();

		for (int b : a.solution(progresses, speeds)) {
			System.out.println(b + " ");
		}

	}

}

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {

		int[] answer = {};
		// k는 몇 번째 작업인지 표시하는 임시변수, complete는 각 작업이 완료된 일수를 표시해주는 변수이다.
		int k = 0;
		int complete = 0;

		ArrayList<Integer> a = new ArrayList<Integer>();

		while (true) {
			// 각 기능들에 speed들을 더해준다.
			for (int i = 0; i < progresses.length; i++) {
				progresses[i] += speeds[i];
			}
			// 만약 k=0 즉, 가장 첫 번째 기능이 완료가 됬을 상황. complete개수 추가.
			if (progresses[k] >= 100) {
				complete++;
				for (int i = k + 1; i < progresses.length; i++) {
					if (progresses[i] < 100) {
						k = i;
						break;
					} // 만약 다음 작업도 완료가 됬으면 작업 완료 개수를 추가하고 k를 1증가시켜 다음 작업 확인
					else
						complete++;
					k++;
				}
				// 작업 완료 개수를 추가하고 0으로 초기화 해준다.
				a.add(complete);
				complete = 0;
			}
			// 전체 작업이 종료되면 break해준다.
			if (k == progresses.length - 1 && progresses[k] >= 100)
				break;
		}
		answer = new int[a.size()];

		for (int i = 0; i < a.size(); i++) {
			answer[i] = a.get(i);
		}

		return answer;
	}
}
