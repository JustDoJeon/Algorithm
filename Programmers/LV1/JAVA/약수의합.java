package Programmers.level1;

import java.util.HashSet;

public class 약수의합 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				hs.add(i);
			}
		}
		
		int sum = 0;
		
		for(int a : hs) {
			sum += a;
		}
		System.out.println(sum);
	}

}
