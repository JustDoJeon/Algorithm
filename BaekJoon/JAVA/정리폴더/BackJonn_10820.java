package Online_Lecture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackJonn_10820 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = "";
		while ((input = br.readLine()) != null) {
			int[] arr = new int[4];

			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
					arr[0]++;
				}
				if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
					arr[1]++;
				}
				if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
					arr[2]++;
				}
				if (input.charAt(i) == ' ') {
					arr[3]++;
				}

			}
			for (int i : arr) {
				bw.write(i + " ");
			}
			bw.write("\n");
			
			bw.flush();

		}

	}

}
