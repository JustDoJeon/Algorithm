package BaekJoon.단계별풀기.조건문;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 주사위세개 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		for (int i = 0; i < 3; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		map.put(arr[0], map.getOrDefault(arr[0], 0) + 1);
		map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
		map.put(arr[2], map.getOrDefault(arr[2], 0) + 1);
		if (map.size() == 1) {
			answer = arr[0] * 1000 + 10000;
		} else if (map.size() == 2) {
			if (map.get(arr[0]) == 2) {
				answer = arr[0] * 100 + 1000;
			} else {
				answer = arr[1] * 100 + 1000;
			}
		} else {
			answer = max * 100;
		}
		
		System.out.println(answer);
	}
}
