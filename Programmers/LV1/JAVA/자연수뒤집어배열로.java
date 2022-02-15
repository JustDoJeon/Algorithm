package Programmers.level1;

public class 자연수뒤집어배열로 {

	public static void main(String[] args) {
		long n = 12345;

		System.out.println(solution(n));
	}

	public static int[] solution(long n) {

		// 12345 => 5,4,3,2,1
		String[] strArr = String.valueOf(n).split("");
		int[] answer = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}

//		System.out.println(strArr.length); // 5

		// 자바엔 바로 뒤집는거없나..

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(" i : " + i);
			answer[strArr.length - i - 1] = Integer.parseInt(strArr[i]);
		}

		// 출력검사
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

		return answer;
	}

}
