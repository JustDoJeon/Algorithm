package prac.part1;

import java.util.Scanner;

public class 지능형기차2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int total = 0;
		int in = 0;
		int out = 0;
		int[] arr = new int[2];
		for (int i = 0; i < 10; i++) {
			out = sc.nextInt();
			in = sc.nextInt();
			sum += in - out;
			if(total < sum) {
				total = sum;
			}
		}
		
		System.out.println(total);
	}

}
