package Online_Lecture;

import java.util.Scanner;

public class BackJoon_10809 {

	// 97~122
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(input.indexOf(c) + " ");
		}

	}

}
