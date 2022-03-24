package 중급2.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class S1_하노이탑이동순서 {

	public static int answer = 0;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		moveHanoiTower(num, 1, 2, 3);
		sb.insert(0, answer + "\n");
		System.out.println(sb);

	}

	public static void moveHanoiTower(int num, int from, int by, int to) {
		answer++;
		// 이동할 원반의 수가 1개라면?
		if (num == 1) {
			System.out.println(from + " " + to);
		} else {
			// STEP 1: num-1개를 a에서 b로 이동
			moveHanoiTower(num - 1, from, to, by);
			// STEP 2: 1개를 A에서 C로 이동
			System.out.println(from + " " + to);
			// STEP 3 : num-1개를 B에서 C로 이동
			moveHanoiTower(num - 1, by, from, to);
		}
	}

}
