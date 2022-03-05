package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 음양더하기 {

	public static void main(String[] args) {
		
		int[] absolutes = {1,1,1};
		boolean signs[] = {false,true,false};
		
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for(int i = 0; i<absolutes.length; i++) {
			map.put(absolutes[i], signs[i]);
		}
		
		int sum = 0;
		
		for(int i=0; i<absolutes.length; i++) {
			if(signs[i] == false) {
				sum += (-1) * absolutes[i];
			}else {
				sum+= absolutes[i];
			}
		}
		
		System.out.println(sum);
		
	}

}
