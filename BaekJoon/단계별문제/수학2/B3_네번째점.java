package 단계별.수학2;

import java.util.ArrayList;
import java.util.Scanner;

public class B3_네번째점 {
	static boolean[] visit;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		int[] y = new int[3];
		int dx = 0;
		int dy = 0;
		for (int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		if (x[1] == x[2]) {
			dx = x[0];
		}else if(x[0]==x[1]) {
			dx = x[2];
		}else if(x[0] == x[2]) {
			dx = x[1];
		}
		
		if (y[1] == y[2]) {
			dy = y[0];
		}else if(y[0]==y[1]) {
			dy = y[2];
		}else if(y[0] == y[2]) {
			dy = y[1];
		}
		
		System.out.println(dx + " " + dy);
	}

}
