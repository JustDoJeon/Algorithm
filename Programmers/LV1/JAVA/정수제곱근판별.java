package Programmers.level1;

public class 정수제곱근판별 {

	public static void main(String[] args) {

		long answer = 0;
		int n = 120;

		Double sqrt = Math.sqrt(n);
		
		if(sqrt == sqrt.intValue()) {
			answer = (long) Math.pow(sqrt+1, 2);
		}else {
			answer = -1;
		}

		
		
		System.out.println(answer);

	}

}
