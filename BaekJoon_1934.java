package Online_Lecture;
//2020-08-17
import java.util.Scanner;

public class BaekJoon_1934 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 몇번할건지 체크
		int N = sc.nextInt();

		int A = 0;
		int B = 0;

		int gcd = 0;
		int lcm = 0;
		for (int i = 0; i < N; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			gcd = gcdIn(Math.max(A, B), Math.min(A, B));
			lcm = lcmIn(A, B, gcd);
			System.out.println(lcm);
		}

	}

	public static int gcdIn(int a, int b) {
		while (b > 0) {
			int tmp = a;
			a = b;
			b = tmp % a;
		}

		return a;
	}

	public static int lcmIn(int a, int b, int g) {
		return ((a * b) / g);
	}

}
