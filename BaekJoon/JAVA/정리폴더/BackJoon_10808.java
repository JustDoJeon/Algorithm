package Online_Lecture;

import java.util.Scanner;

public class BackJoon_10808 {

	// 97~122
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		int[] result = new int[26];

		StringBuilder sb =new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			result[(int)input.charAt(i)-97]++;
		}
		
		for(int a : result) {
			System.out.print(a+" ");
		}

	}

}
