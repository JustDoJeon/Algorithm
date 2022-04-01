package 단계별.수학1;

import java.util.Scanner;

public class B2_벌집 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 1. 1 1개
		// 2. 2 3 4 5 6 7 6개
		// 3. 8 ~ 19 12개
		// 4. 20 ~ 37 18개
		
		int range = 2;
		int count = 1;
		if (n == 1) {
			System.out.println(1);
			System.exit(0);
		}else {
			while(range <=n) {
				range = range + (6*count);
				count++; 
			}
		}
		
		System.out.println(count);
	

	}

}
