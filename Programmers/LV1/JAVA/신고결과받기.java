package Programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class 신고결과받기 {

	public static void main(String[] args) {

		신고결과받기 a = new 신고결과받기();
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 3;

		System.out.println(a.solution(id_list, report, k));

	}

	public static int[] solution(String[] id_list, String[] report, int k) {

		Map<String, List<String>> map = new HashMap<>();
		Map<String, Integer> mail_map = new HashMap<String, Integer>();
		// key : 유저, value : 유저를 신고한 사람들

		for (String user : id_list) {
			List<String> list = new LinkedList<String>();
			map.put(user, list);
			mail_map.put(user, 0);
		}

		// 신고자 : attacker 당한자 : defender
		for (String temp : report) {
			String[] arr = temp.split(" ");
			String attacker = arr[0];
			String defender = arr[1];
			List<String> list = map.get(defender);
			System.out.println(list);
			if (list.contains(attacker)) {
				continue;
			}
			list.add(attacker);
			map.put(defender, list);
		}

		for (String data : map.keySet()) {
			List<String> list = map.get(data);
			if (list.size() >= k) {
				for (String user : list) {
					int count = mail_map.get(user) + 1;
					mail_map.put(user, count);
				}
			}
		}

		int i = 0;
		int[] answer = new int[id_list.length];
		for (String data : id_list) {
			answer[i] = mail_map.get(data);
			i++;
		}
		return answer;

	}

}
