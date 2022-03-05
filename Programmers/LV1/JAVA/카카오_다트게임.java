package Programmers.level1;

import java.util.StringTokenizer;

public class 카카오_다트게임 {

	public static void main(String[] args) {

		String str = "1S2D*3T";
		// 1의1승 *2 *2 + 2^3 *2 +
		char[] darts = str.toCharArray();

		int score[] = new int[3];
		int cnt = -1;
		for (int i = 0; i < darts.length; i++) {
			if (darts[i] >= '0' && darts[i] <= '9') {
				cnt++;
				if (darts[i] == '1' && darts[i + 1] == '0') { // 10점인경우
					score[cnt] = 10;
					i++;
				} else { // 아닌경우 그냥 숫자 넣는거
					score[cnt] = darts[i] - '0';
				}
			} else if (darts[i] == 'S') {
				score[cnt] *= 1;
			} else if (darts[i] == 'D') {
				score[cnt] *= score[cnt];
			} else if (darts[i] == 'T') {
				score[cnt] *= score[cnt] * score[cnt];
			} else if (darts[i] == '*') {
				if (cnt > 0) {
					score[cnt - 1] *= 2;
				}
				score[cnt] *= 2;
			} else if (darts[i] == '#') {
				score[cnt] *= -1;
			}
		}

		System.out.println(score[0] + score[1] + score[2]);

	}

}
