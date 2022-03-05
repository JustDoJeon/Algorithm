package Programmers.level1;

public class 문자열다루기기본 {

	public static void main(String[] args) {

		String s = "a1234";
		
		boolean answer  = true;
		if(s.length() != 4 && s.length() != 6) {
			answer = false;
		}
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				answer = false;
				break;
			}else {
				answer = true;
			}
		}
		System.out.println(answer);

		
		
	}

}
