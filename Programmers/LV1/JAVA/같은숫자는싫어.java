package Programmers.level1;

import java.util.ArrayList;

public class 같은숫자는싫어 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };

		int temp = Integer.MIN_VALUE;


		for (int i = 0; i < arr.length; i++) {
			if(temp != arr[i]) {
				temp = arr[i];
				list.add(temp);
			}
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
			System.out.println(answer[i] + " ");
		}

	}

}
