package 단계별.수학2;

import java.util.ArrayList;
import java.util.Scanner;

public class S5_소인수분해 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
		}

	}

}
