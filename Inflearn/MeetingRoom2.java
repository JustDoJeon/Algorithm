package StringArray;
//priority queue  우선순위를 담는것

/*
 * 1.소팅
 * 2.Priority Queue
 * 3. End <= start 합치기
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Interval {
	int start;
	int end;

	public Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}

}

public class MeetingRoom2 {

	public static void main(String[] args) {

		MeetingRoom2 a = new MeetingRoom2();
		Interval in1 = new Interval(5, 10);
		Interval in2 = new Interval(15, 20);
		Interval in3 = new Interval(0, 30);

		Interval[] intervals = { in1, in2, in3 };

		System.out.println(a.solve(intervals));

	}

	public int solve(Interval[] intervals) {

		if (intervals == null || intervals.length == 0) {
			return 0;
		}

		System.out.println("===========소팅전==========");

		print(intervals);

		System.out.println("===========소팅후==========");

		Arrays.sort(intervals, Comp);

		print(intervals);

		Queue<Interval> heap = new PriorityQueue<Interval>(intervals.length, Comp2);
//		System.out.println(intervals.length);  3으로 찍힘

		heap.offer(intervals[0]);
		// 이미 하나들어와있기때문에 1부터 돌림
		for (int i = 1; i < intervals.length; i++) {

			Interval interval = heap.poll();
			// 0-30분 회의가 진행되고있는데 새로운회의가 5분에서 시작되는데
			// 30분이(intervals.end)가 더 커 그러면 힙에 하나 더 넣어준다는말
//			=>  힙에 하나 더 넣어준다는말 =힙하나 더 만들어준다거
			if (intervals[i].start < interval.end) {
				heap.offer(intervals[i]);
			}
			heap.offer(interval);
		}
		return heap.size();
	}

	Comparator<Interval> Comp = new Comparator<Interval>() {

		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.start - o2.start;
		}
	};

	Comparator<Interval> Comp2 = new Comparator<Interval>() {

		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			return o1.end - o2.end;
		}
	};

	public void print(Interval[] intervals) {
		for (int i = 0; i < intervals.length; i++) {
			Interval in = intervals[i];
			System.out.println(in.start + " " + in.end);
		}
	}

}
