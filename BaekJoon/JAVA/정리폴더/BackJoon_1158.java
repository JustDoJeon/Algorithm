package Queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Queue_Practice2 {

	public static void main(String[] args) throws IOException {

		// 3 4 5 6 7 1 2
		// 1 2 4 5 6 7 q 3
		// 12 5 6 7 q 3

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Deque<Integer> deque = new ArrayDeque<>();

		StringBuilder sb = new StringBuilder("<");

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());

		int k = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= n; i++) {
			deque.add(i);
		}

		while (!deque.isEmpty()) {
			for (int i = 0; i < k - 1; i++) {
				deque.addLast(deque.removeFirst());
			}
			sb.append(deque.removeFirst() + ", ");
		}
		System.out.println(sb.toString().substring(0, sb.length() - 2) + ">");

	}

}
