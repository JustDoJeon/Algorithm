package Programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 카카오_주차요금계산 {

	public static void main(String[] args) {

		// 기본시간 180분 기본요금 5000원 단위시간 10분 단위요금 600원
		int[] fees = { 180, 5000, 10, 600 };

		String[] records = { "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
				"18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT" };

		solve(fees, records);
		
	}

	public static int[] solve(int[] fees, String[] records) {
		int[] answer = {};

		int lastTime = calcTime("23:59");

		// 현재 파킹중인 차들
		Map<String, Integer> parking = new HashMap<String, Integer>();

		// 차들의 누적 파킹시간
		Map<String, Integer> times = new HashMap<String, Integer>();

		// 차들 lists
		List<String> cars = new ArrayList<String>();

		for (String record : records) {
			String[] rc = record.split(" ");
			int time = calcTime(rc[0]);
			String car = rc[1];

			if (!cars.contains(car)) {
				cars.add(car);
				times.put(car, 0);
			}

			if (parking.containsKey(car)) {
				// 현재 파킹이 되어 있다면 나갈차다.
				times.put(car, times.get(car) + (time - parking.get(car)));
				parking.remove(car);
			} else {
				// 입차
				parking.put(car, time);
			}
		}

		int[] ret = new int[cars.size()];
		// 차번 순으로 정렬
		Collections.sort(cars);

		for (int i = 0; i < cars.size(); i++) {
			// 기본요금
			ret[i] = fees[1];
			String car = cars.get(i);
			// 누적시간 중 기본요금 시간제외
			int time = times.get(car) - fees[0];
			// 아직 출차가 안됬더라면 마지막시간으로 정산
			if (parking.containsKey(car)) {
				time += (lastTime - parking.get(car));
			}
			if (time > 0) {
				ret[i] += (Math.ceil(time / (fees[2] * 1.0)) * fees[3]);
			}
		}
		
		for(int i=0; i<ret.length; i++) {
			System.out.println(ret[i]);
		}

		return ret;
	}

	// 표기된 시간 변경해주는것
	public static int calcTime(String str) {
		String[] time = str.split(":");
		int min = Integer.parseInt(time[0]) * 60;
		min += Integer.parseInt(time[1]);
		return min;
	}

}
