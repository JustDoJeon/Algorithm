package Programmers.level1;

public class 두정수사이의합 {
	public static void main(String[] args) {
		long answer = 0; 
		
		int a = 213;
		int b = 22;

		int x = Math.min(a, b);
		int y = Math.max(a, b);
		
		System.out.println(a + " " + b);

		if (x == y) {
			answer = x;
			System.out.println(answer);

		}

		for (int i = x; i <= y; i++) {
			System.out.println(" i : " + i);
			answer += i;
		}

		System.out.println("answer : " + answer);
	}

}
