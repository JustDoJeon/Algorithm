package 단계별.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class S5_단어정렬 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		PriorityQueue<String> queue = new PriorityQueue<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					for (int i = 0; i < o1.length(); i++) {
						if (o1.charAt(i) != o2.charAt(i)) {
							return Integer.valueOf(o1.charAt(i)) - Integer.valueOf(o2.charAt(i));
						}
					}
				}
				return o1.length() - o2.length();
			}
		});

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			queue.offer(str);
		}

		while (!queue.isEmpty()) {
			String cur = queue.poll();
			if (queue.contains(cur)) {
				continue;
			}
			System.out.println(cur);
		}

	}

}
