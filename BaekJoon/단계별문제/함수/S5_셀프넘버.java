package 단계별.함수;

import java.util.Arrays;

public class S5_셀프넘버 {
	static boolean[] visited;

	public static void main(String[] args) {

		visited = new boolean[10001];

		for (int i = 1; i < 10001; i++) {
			int n = self(i);
			if(n<10001) {
				visited[n] = true;
			}
		}

		for (int i = 1; i < 10001; i++) {
			if (visited[i] == false) {
				System.out.println(i);
			}
		}

	}

	public static int self(int num) {

		
		
		int sum = num;

		while (num != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		
	

		return sum;
	}

}
