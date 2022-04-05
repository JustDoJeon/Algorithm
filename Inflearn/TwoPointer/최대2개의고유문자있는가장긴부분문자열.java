package Inflearn.TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class 최대2개의고유문자있는가장긴부분문자열 {
	// 최대 두개의 고유문자를 포함하는 가장 긴 부분 문자열의 길이를 리턴
	public static void main(String[] args) {

		String s = "ccaabbb";
	}
	
	public static int solve(String s) {
		//1.ds
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int l = 0;
		int r = 0;
		int counter = 0;
		int max = 0;
		
		//2.
		while(r<s.length()){
			char c = s.charAt(r); // ccaabbb
			map.put(c, map.getOrDefault(c, 0)+1); //c = 2 a = 2 b  
			if(map.get(c) == 1) {
				counter++; // 3개가ㅣㅏ되는것
			}
			r++;
			
			while(counter>2) {
				//cc앞에 두개 없애는것
				char c2 = s.charAt(l);
				map.put(c2, map.get(c2)-1);
				if(map.get(c2)==0) {
					counter--; // 이때2개가됨(c가없어졌으니깐) 
				}
				l++;
			}
			
			max = Math.max(max, r-l);
		}
	}

}
