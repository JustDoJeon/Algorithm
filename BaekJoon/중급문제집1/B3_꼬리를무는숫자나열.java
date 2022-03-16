package 중급0314시작.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_꼬리를무는숫자나열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int x1, x2, y1, y2 = 0;

		if (n % 4 == 0) {
			x1 = n / 4;
			y1 = 1;
		} else {
			x1 = (n / 4) + 1;
			y1 = 5 - (n % 4);
		}

		if (m % 4 == 0) {
			x2 = m / 4;
			y2 = 1;
		} else {
			x2 = (m / 4) + 1;
			y2 = 5 - (m % 4);
		}
		
		System.out.println(Math.abs(x2-x1) + Math.abs(y2-y1));

	}

}
