package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 체육복 {

	public static void main(String[] args) {

		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };

		System.out.println(solution(n, lost, reserve));

	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;

		int[] arr = new int[n];

		
		for(int i=0; i<lost.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					answer++;
					lost[i] = -1000;
					reserve[j] = -1000;
					break;
				}
			}
		}
		
		
		for(int l : lost){
			for(int i=0; i<reserve.length; i++) {
				if(l == reserve[i]-1 || l == reserve[i] +1) {
					answer++;
					reserve[i] = -1;
					break;
				}
			}
		}
		
		

		return answer;
	}

}
