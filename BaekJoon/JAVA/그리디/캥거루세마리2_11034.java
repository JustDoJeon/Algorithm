package BOJ.Greedy;

import java.util.Scanner;

public class 캥거루세마리2_11034 {

	public static void main(String[] args) {

		int[] kang = new int[3];
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		int n = 2;

		while (sc.hasNext()) {
			for (int i = 0; i < 3; i++) {
				kang[i] = sc.nextInt();
			}

			if (kang[2] - kang[1] - 1 > kang[1] - kang[0] - 1) {
				sum = kang[2] - kang[1] - 1;
			} else {
				sum = kang[1] - kang[0] - 1;
			}

			System.out.println(sum);
			n--;
		}
	}

}
