package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {

		String answer = "";
		Map<Integer, String> map = new HashMap<Integer, String>();
		String[] seoul = { "Jane", "Kim" };
		int a = 0;
		for (String s : seoul) {
			map.put(a, s);
			a++;
		}

		int loc = 0;

		for (int i = 0; i < map.size(); i++) {
			if (map.get(i).equals("Kim")) {
				loc = i;
			}
		}

		answer = "김서방은" + " " + loc + "에 있다";
	}

}
