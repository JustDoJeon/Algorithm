package solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_펠린드롬수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			boolean flag = true;

			String str = br.readLine();

			if (str.equals("0")) {
				break;
			}

			int len = str.length() / 2;

			for (int i = 0; i < len; i++) {
				char a = str.charAt(i);
				char b = str.charAt(str.length() - i - 1);
				if (a != b) {
					flag = false;
				}
			}

			if (flag) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		}

	}

}
