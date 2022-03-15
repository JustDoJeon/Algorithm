package 중급0314시작.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_뒤집힌덧셈_CLEAR {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(st.nextToken());

		int newA = Integer.parseInt(sb.append(a).reverse().toString());

		sb.setLength(0);

		int b = Integer.parseInt(st.nextToken());

		int newB = Integer.parseInt(sb.append(b).reverse().toString());

		sb.setLength(0);

		System.out.println(Integer.parseInt(sb.append(newA + newB + "").reverse().toString()));
	}
}
