/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
        class ListNodeComparator implements Comparator<ListNode> {   //构造一个comparator 比较node的值
            //@override
            public int compare(ListNode a, ListNode b) {
                return a.val - b.val;
            }
        }
        
        public ListNode mergeKLists(ListNode[] lists) {
            ListNode dummy = new ListNode(0);
            if (lists == null || lists.length == 0) {
                return dummy.next;
            }
            
            int size = lists.length;
            ListNode current = dummy;
            
            ListNodeComparator cmp = new ListNodeComparator();
            PriorityQueue<ListNode> heap = new PriorityQueue(cmp);
            for (int i = 0; i < size; i ++) {
                if (lists[i] != null) {
                    heap.add(lists[i]);
                }
            }
            
            while (heap.size() != 0) {
                ListNode node = heap.poll();
                current.next = node;  // 指导
                current = current.next;
                if (node.next != null ) {
                    heap.add(node.next);
                }
            }
            
            return dummy.next;
        }
}