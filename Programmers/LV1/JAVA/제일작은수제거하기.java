package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 제일작은수제거하기 {

	public static void main(String[] args) {

		int[] arr = { 3, 6, 1, 4 };
		int[] answer;
		
		int[] arrC = {};
		arrC = arr.clone();
		for(int i=0; i<arr.length; i++) {
		System.out.println(arrC[i]);
		}
		Arrays.sort(arr);

		int min = arr[0];

		ArrayList<Integer> arrList = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min) {
				arrList.add(arr[i]);
			}
		}

		if (arrList.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[arrList.size()];
			for (int i = 0; i < arrList.size(); i++) {
				answer[i] = arrList.get(i);
			}
		}

		for(int i=0; i<arrList.size(); i++) {
			System.out.println(answer[i]);
		}
		
	}

}
