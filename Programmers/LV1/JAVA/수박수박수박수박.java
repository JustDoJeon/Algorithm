package Programmers.level1;

public class 수박수박수박수박 {

	public static void main(String[] args) {

		String answer = "";
		int n = 4;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "수";
			}else {
				answer +="박";
			}
		}
		System.out.println(answer);
	}

}
