package String_Ex;

import java.util.Scanner;

/**
 * @author wjseh
 *			ȸ�� ���ڿ� ����
 *         ��Ī�� �������� �ƴ��� Ȯ���ϴ� ���� (��ҹ��� ���� NO) 
 *         
 *         ��� 1 �������� ���
 *         ��� 2 StringBuilder ���
 */
public class Solution7 {

	public static void main(String[] args) {

		String answer = "NO";

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		/*
		 * ��� 1 str = str.toUpperCase();
		 * 
		 * int lt = 0; int rt = str.length() - 1;
		 * 
		 * int len = str.length();
		 * 
		 * for (int i = 0; i < len / 2; i++) { if (str.charAt(i) != str.charAt(len - i -
		 * 1)) { answer = "NO"; } if (str.charAt(i) == str.charAt(len - i - 1)) { answer
		 * = "YES"; } }
		 * 
		 * 
		 * }
		 * 
		 */

		// ��� 2

		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(tmp)) {
			answer = "YES";
		}
		
		System.out.println(answer);
	}
}
