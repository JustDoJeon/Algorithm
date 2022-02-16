package Programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class 문자열내맘대로정렬하기 {
	
	public static void main(String[] args) {
		
		String[] strings = {"sun", "bed", "car"};
		
		int n = 1;
		
		String[] answer = new String[strings.length];
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=0; i<strings.length; i++) {
			arr.add(strings[i].charAt(n) + strings[i]);
		}
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i) + " ");
		}
		
		Collections.sort(arr);
		
		for(int i=0; i<arr.size(); i++) {
			answer[i] = arr.get(i).substring(1);
		}
		
	}

}
