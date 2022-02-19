package prac.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class 약수구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				arr.add(i);
			}

		}
		if (arr.size() < k) {
			System.out.println("0");
		} else {
			System.out.println(arr.get(k - 1));
		}
	}

}
