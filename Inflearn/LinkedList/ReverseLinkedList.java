package Inflearn.LinkedList;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);

	}
	
	public static ListNode reverseList(ListNode cur) {
		//1.ds 
		ListNode next = null;
		ListNode prev = null;
		
		//2.for while
		while(cur != null) {
			next = cur.next; // cur 다음 step 2N - 3 0
			cur.next = prev;
			prev = cur;
			cur = next; //cur 다음   step 2n-3 0
		}
		
		return prev;
	}

}
