package Programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순 {
	
	public static void main(String[] args) {
		
		String s = "Zbcdefg";
		
		char[] c = s.toCharArray();
		//A : 65 Z : 90  , a : 97  z :  122
		
		Arrays.sort(c);
		
		StringBuilder sb = new StringBuilder(new String(c)).reverse();
		String answer = sb.toString();
		
		System.out.println(answer);
		
	}

}
