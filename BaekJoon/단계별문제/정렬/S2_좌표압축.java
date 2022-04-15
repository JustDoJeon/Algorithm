package 단계별.정렬;

import java.util.ArrayList;
import java.util.Scanner;

public class S2_좌표압축 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		int mem = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			int cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					if (a > arr[j] && arr[j] != mem) {
						mem = arr[j];
						cnt++;
					}
				}
			}
			list.add(cnt);
		}

		int[] res = new int[n];
		res = list.stream().mapToInt(i -> i).toArray();
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

}
