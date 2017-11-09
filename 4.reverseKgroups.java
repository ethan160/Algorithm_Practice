public class Solution {
	public static ListNode(ListNode pre, ListNode next) {
		ListNode last = pre.next;
		ListNode cur = last.next;
		while (cur!= null) {
			last.next = cur.next;
			cur.next = pre.next;
			pre.next = cur;
			cur = last.next;
		}
		return last;
	}



public static ListNode reverseKGroup(ListNode head, int k) {
	if (head == null || k == 1) {
		return head;
	}

	ListNode dummy = new ListNode(0);
	dummy.next = head;
	int count = 0; 
	ListNode pre = dummy;
	ListNode cur = head;


	while(cur != null) {
		count++;
		ListNode next = cur.next;
		if (count == k) {
			pre = reverse(pre, next);
			count = 0;
		}
		cur = next;
	}
	return dummy.next;
}
}