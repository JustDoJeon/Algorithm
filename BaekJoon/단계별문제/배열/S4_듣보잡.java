package 오늘의문제;

import java.util.*;

public class S4_듣보잡 {
	public static void main(String[] args) {
		Set<String> list = new HashSet<>();
		ArrayList<String> list2 = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt(); // 듣지 못한
		int num2 = scanner.nextInt(); // 보도 못한

		for (int i = 0; i < num; i++) {
			String name = scanner.next();
			list.add(name);
		}

		for (int i = 0; i < num2; i++) {
			String name = scanner.next();
			if (list.contains(name)) {
				list2.add(name);
			}
		}
		Collections.sort(list2);
		System.out.println(list2.size());

		for (String a : list2) {
			System.out.println(a);
		}

	}
}