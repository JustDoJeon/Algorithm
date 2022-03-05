package BOJ.Greedy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 컵홀더_2810 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String input = sc.next();

		int count = 1;

		for (int i = 0; i < n; i++) {
			char a = input.charAt(i);

			if (a == 'S') {
				count++;
			} else if (a == 'L') {
				count += 1;
				i++;
			}

		}
		if (n > count) {
			System.out.println(count);
		} else {
			System.out.println(n);
		}
	}

}
