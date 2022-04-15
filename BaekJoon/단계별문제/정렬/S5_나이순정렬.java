package 단계별.정렬;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student {
	int idx;
	int age;
	String name;

	public Student(int idx, int age, String name) {
		this.idx = idx;
		this.age = age;
		this.name = name;
	}
}

public class S5_나이순정렬 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		PriorityQueue<Student> pq = new PriorityQueue<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.age == o2.age) {
					return o1.idx - o2.idx;
				}
				return o1.age - o2.age;
			}
		});

		for (int i = 0; i < n; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			Student s = new Student(i, age, name);
			pq.offer(s);
		}

		while (!pq.isEmpty()) {
			Student cur = pq.poll();
			System.out.println(cur.age + " " + cur.name);
		}

	}

}
