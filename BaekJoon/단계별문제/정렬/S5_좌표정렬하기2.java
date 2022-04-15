package 단계별.정렬;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class S5_좌표정렬하기2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		PriorityQueue<Point> queue = new PriorityQueue<Point>(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {

				if (o1.y == o2.y) {
					return o1.x - o2.x;
				}

				return o1.y - o2.y;
			}

		});
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			Point p = new Point(a, b);
			queue.offer(p);
		}

		while (!queue.isEmpty()) {
			Point cur = queue.poll();
			System.out.println(cur.x + " " + cur.y);
		}

	}

}
