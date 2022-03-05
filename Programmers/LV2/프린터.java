package Programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class 프린터 {

	public static void main(String[] args) {

		int[] priorities = { 2, 1, 3, 2 };

		int location = 1;

		System.out.println("답 : ");

		System.out.println(solution(priorities, location));
	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;
		System.out.println("asdsa");
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int a : priorities) {
			pq.offer(a);
		}

		for (int i = 0; i < priorities.length; i++) {
			while (!pq.isEmpty()) {
				if (pq.peek() == priorities[i]) {
					if (location == i) {
						answer++;
						return answer;
					}
//					System.out.println("pq.poll() 전 : " + pq);
					pq.poll();
//					System.out.println("pq.poll() 후 : " + pq);
					answer++;
				}
			}
		}

		return answer;

	}

}
