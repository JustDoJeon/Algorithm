package Programmers.level1;

import java.util.ArrayList;

public class 핸드폰_번호_가리기 {

	public static void main(String[] args) {

		String answer = "";
		String phone_number = "01033334444";
		String p = "027778888";
		int number_length = phone_number.length();
		int plen = p.length();
		
		for(int i=0; i<number_length-4; i++) {
			answer+="*";
		}
		
		answer += phone_number.substring(number_length-4);
		
		System.out.println(answer);
		
		

	}

}
