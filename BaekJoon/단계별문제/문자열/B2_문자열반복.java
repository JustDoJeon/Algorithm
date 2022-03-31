package BaekJoon.단계별풀기.문자열;

import java.util.Scanner;

public class B2_문자열반복 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n--> 0 ) {
			int k = sc.nextInt();
			String str = sc.next();
			char[] ch  = str.toCharArray(); // 'a' 'b' 'c'
			String answer = "";
			for(int i=0; i<ch.length; i++) {
				for(int j=0; j<k; j++) {
					answer += str.charAt(i);
				}
			}
			
			System.out.println(answer);
			
			
		}
	}

}
