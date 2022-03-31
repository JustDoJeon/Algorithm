package BaekJoon.단계별풀기.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_상수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb;
		sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		String a1 = sb.append(a + "").reverse().toString();
		int b = Integer.parseInt(st.nextToken());
		sb = new StringBuilder(b + "").reverse();
		String b1 = sb.toString();

		int answer = Integer.parseInt(a1) > Integer.parseInt(b1) ? Integer.parseInt(a1) : Integer.parseInt(b1);
		
		System.out.println(answer);
	}

}
