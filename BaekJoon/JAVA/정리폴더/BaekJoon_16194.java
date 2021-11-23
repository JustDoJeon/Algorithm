package Online_DP;
//2020-08-19
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_16194 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int d[], p[], length;

		d = new int[n + 1];
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		length = st.countTokens();
		p = new int[length + 1];

		for (int i = 1; i <= length; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				p[i] = Math.min(p[i], p[i - j] + p[j]);
			}
		}
		System.out.println(p[n]);

	}

}
