package 중급0314시작.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이상한곱셈_clear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputs = br.readLine().split(" ");
		long result = 0;
		
		for(int i=0; i<inputs[0].length(); i++) {
			for(int j=0; j<inputs[1].length(); j++) {
				result += Integer.parseInt(inputs[0].charAt(i)+"")*Integer.parseInt(inputs[1].charAt(j)+"");
			}
		}
		
		System.out.println(result);

	}

}
