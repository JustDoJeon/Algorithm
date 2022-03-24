package 중급2.day2;

import java.io.IOException;
import java.util.Scanner;

public class B1_창영이의일기장 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.replaceAll("apa", "a").replaceAll("epe", "e").replaceAll("ipi", "i").replaceAll("opo", "o")
				.replaceAll("upu", "u");
		System.out.println(input);
	}
}
