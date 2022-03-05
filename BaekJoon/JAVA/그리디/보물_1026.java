package BOJ.Greedy.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//실버4

public class 보물_1026 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			a.add(i, sc.nextInt());
		}

		for (int i = 0; i < n; i++) {
			b.add(i, sc.nextInt());
		}

		Collections.sort(a);
		Collections.sort(b);
		Collections.reverse(b);

		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += (a.get(i) * b.get(i));
		}

		System.out.println(sum);

	}

}
