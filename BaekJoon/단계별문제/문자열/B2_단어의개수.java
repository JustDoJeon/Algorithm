package BaekJoon.단계별풀기.문자열;

import java.util.HashMap;
import java.util.Scanner;

public class B2_단어의개수 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine().trim();
		if(str==" ") {
			System.out.println("0");
			System.exit(0);
		}
		
		String[] a = str.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}

		System.out.println(map.size());

	}
}
