import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_빈도수 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		int cnt = 0;
		String kstr = k + "";
		for (int i = 1; i <= n; i++) {
			String str = i + "";
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == kstr.charAt(0)) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
