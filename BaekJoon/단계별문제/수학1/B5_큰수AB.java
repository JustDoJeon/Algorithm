package 단계별.수학1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class B5_큰수AB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		BigInteger A = new BigInteger(str1);
		BigInteger B = new BigInteger(str2);
		System.out.println(A.add(B));
	}
}
