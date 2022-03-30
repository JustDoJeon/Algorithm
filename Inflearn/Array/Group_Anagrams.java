package inflearn;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Group_Anagrams {
	public static void main(String[] args) {
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };

		ArrayList<ArrayList<String>> result = solve2(str);
		for (ArrayList<String> aa : result) {
			System.out.println(aa + "");
		}
	}

	public static ArrayList<ArrayList<String>> solve1(String[] strs) {
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

		for (String str : strs) {
			char[] charArr = str.toCharArray();
			Arrays.sort(charArr); // [a,e,t]
			String key = String.valueOf(charArr); // aet

			if (map.containsKey(key)) {
				map.get(key).add(str);
			} else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(str);
				map.put(key, list);
			}
		}

		result.addAll(map.values());

		return result;
	}

	public static ArrayList<ArrayList<String>> solve2(String[] strs) {
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		for (String str : strs) {
			int[] count = new int[26];
			for (int i = 0; i < str.length(); i++) {
				count[str.charAt(i) - 'a']++;
			}
			String key = Arrays.toString(count);
			if (map.containsKey(key)) {
				map.get(key).add(str);
			} else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(str);
				map.put(key, list);
			}
		}

		result.addAll(map.values());

		return result;
	}

}
