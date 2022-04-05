package Inflearn.TwoPointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class 단어중복없는가장긴문자열 {
	public static void main(String[] args) {

		String str = "pwwkea";
		// 내 풀이
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		ArrayList<Character> list = new ArrayList<Character>();
		map.put(str.charAt(0), 1);
		for (int i = 1; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				list.clear();
				list.add(str.charAt(i));
				map.clear();
				map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
			} else if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
				list.add(str.charAt(i));
			}
		}
		String answer = "";
		for (int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}

		System.out.println(answer);
	}

	public static int solve_map(String str) {
		// 1. ds
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int l = 0;
		int r = 0;
		int counter = 0;
		int max = 0;

		// 2.
		while (r < str.length()) {
			char c = str.charAt(r);
			map.put(c, map.getOrDefault(c, 0) + 1);
			if(map.get(c) > 1) {
				counter++;
			}
			r++;
			
			while(counter>0) {
				char c2 = str.charAt(l);
				if(map.get(c2)>1) {
					counter--;
				}
				map.put(c2, map.get(c2)-1);
				l++;
			}
			max = Math.max(max, r-l);
		}
		
		return max;
	}
}
