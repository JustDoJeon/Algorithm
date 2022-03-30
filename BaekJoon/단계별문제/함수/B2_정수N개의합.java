package 단계별.함수;

public class B2_정수N개의합 {

	public static void main(String[] args) {

	}

	public long sum(int[] a) {
		long answer = 0;

		for (int i = 0; i < a.length; i++) {
			answer += a[i];
		}

		return answer;
	}

}
