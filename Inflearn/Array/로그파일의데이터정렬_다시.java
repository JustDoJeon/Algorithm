package Inflearn.Sorting_Search;

import java.util.Arrays;

public class 로그파일의데이터정렬_다시 {

	public static void main(String[] args) {

		String[] logs = { "dig1 8 2 3 1", "let1 abc cat", "dig1 2 5", "let2 good dog book", "let3 abc zoo" };

	}

	public static String[] solve(String[] logs) {
		Arrays.sort(logs, (s1, s2) -> {
			String[] split1 = s1.split(" ", 2); // dig1
			String[] split2 = s2.split(" ", 2); // 8 2 3 1

			boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
			boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

			if (!isDigit1 && !isDigit2) {
				// 1.모두 문자
				int comp = split1[1].compareTo(split2[1]); // 오름차순 마 -1
				if (comp == 0) {
					return split1[0].compareTo(split2[0]);
				} else {
					return comp;
				}
			} else if (isDigit1 && isDigit2) {
				// 2. 모두 숫자
				return 0;
			} else if (isDigit1 && !isDigit2) {
				// 3. 첫번째는 숫자, 두번째는 문자
				return 1;
			} else {
				// 4. 첫번째는 문자, 두번째는 숫자.
				return -1;
			}

		});
	}

}
