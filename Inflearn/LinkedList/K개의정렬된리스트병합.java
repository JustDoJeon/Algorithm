package Inflearn.LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class K개의정렬된리스트병합 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode l3 = new ListNode(2);
		l3.next = new ListNode(7);

		ListNode[] lists = new ListNode[3];
		lists[0] = l1;
		lists[1] = l2;
		lists[2] = l3;

		ListNode a = solve(lists);
		print(a);

	}

	public static ListNode solve(ListNode[] lists) {
		// minHeap 만들기 1
		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a, b) -> a.val - b.val);

		ListNode head = new ListNode(0);
		ListNode res = head;

		// 2.for-while
		for (ListNode list : lists) {
			if (list != null) {
				pq.offer(list);
			}

			while (!pq.isEmpty()) {
				ListNode node = pq.poll();
				System.out.println("node.val : " + node.val); // 1 1 2
				res.next = node;
				res = res.next;

				if (node.next != null) {
					pq.offer(node.next);
				}
			}

		}

		return head.next;

	}

	private static void print(ListNode node) {
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

}
