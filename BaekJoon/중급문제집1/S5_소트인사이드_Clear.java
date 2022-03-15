package 중급0314시작.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class S5_소트인사이드_Clear {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 1234
		int num = Integer.parseInt(br.readLine());

		String answer = "";

		String str = num + "";
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			list.add(i, str.charAt(i));
		}

		Collections.sort(list);
		Collections.reverse(list);

		for(int i=0; i<list.size(); i++) {
			answer+=list.get(i);
		}
		
		System.out.println(answer);
	}

}
