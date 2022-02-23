package BOJ.Greedy;

import java.util.Scanner;

public class 백준_5와6의차이_2864 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		String AA = "";
		String AB = "";
		String BA = "";
		String BB = "";

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '6') {
				AA = AA + "5";
			} else {
				AA = AA + a.charAt(i);
			}

			if (a.charAt(i) == '5') {
				AB = AB + "6";
			} else {
				AB = AB + a.charAt(i);
			}

		}

		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '6') {
				BA = BA + "5";
			} else {
				BA = BA + b.charAt(i);
			}

			if (b.charAt(i) == '5') {
				BB = BB + "6";
			} else {
				BB = BB + b.charAt(i);
			}
		}
	
		int max = Integer.parseInt(AB) + Integer.parseInt(BB);
		int min = Integer.parseInt(AA) + Integer.parseInt(BA);
		
		System.out.println(min + " " + max);
	}

}
