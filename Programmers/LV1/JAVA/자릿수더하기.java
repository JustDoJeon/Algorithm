package Programmers.level1;

public class 자릿수더하기 {

	public static void main(String[] args) {

		int answer = 0;

		int n= 987;
		
		String[] str = String.valueOf(n).split("");

		for (int i = 0; i < str.length; i++) {
			answer += Integer.parseInt(str[i]);
		}
		
		System.out.println(answer);

	}

}
