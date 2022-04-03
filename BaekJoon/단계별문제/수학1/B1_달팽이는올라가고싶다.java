package 단계별.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_달팽이는올라가고싶다 {
	static long v;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		long a = Long.parseLong(st.nextToken());// 낮에 올라감
		long b = Long.parseLong(st.nextToken()); // 밤에 떨어짐
		v = Long.parseLong(st.nextToken()); // 목표 높이

		long temp = (v - b) / (a - b);
		if ((v - b) % (a - b) != 0) {
			temp++;
		}
		System.out.println("답 : " + temp);
		System.out.println("============시뮬레이션으로 해보는중 ===========");
		long k = 0;
		int day = 0;
		while (k <= v) {
			k = k + a;
			if (!check(k)) {
				day++;
				break;
			}
			k -= b;
			if (!check(k)) {
				day++;
				break;
			}

			if (check(k)) {
				day++;
			}
		}

		System.out.println("day :" + day);
	}

	public static boolean check(long a) {
		if (a >= v) {
			return false;
		}
		return true;
	}
}
