package BaekJoon.단계별풀기.반복문;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class X보다작은수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		Queue<Integer> queue= new LinkedList<Integer>();
		while(N-- >0) {
			int a = sc.nextInt();
			if(a<X) {
				queue.add(a);
			}
		}
		
		while(!queue.isEmpty()) {
			int ans = queue.poll();
			System.out.print(ans+" ");
		}
		
	}

}
