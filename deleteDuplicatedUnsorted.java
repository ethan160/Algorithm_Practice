/* Write a removeDuplicates() function which takes a list and deletes
any duplicate nodes from the list. The list is not sorted.

For example if the linked list is 12->11->12->21->41->43->21,
then removeDuplicates() should convert the list to 12->11->21->41->43.

If temporary buffer is not allowed, how to solve it?
*/

public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode curr = head;
        while (curr != null) {
            ListNode inner = curr;
            while (inner.next != null) {
                if (inner.next.val == curr.val) {
                    inner.next = inner.next.next;
                } else {
                    inner = inner.next;
                }
            }
            curr = curr.next;
        }

        return head;
    }
}
/*源码分析
删除链表的操作一般判断node.next较为合适，循环时注意inner = inner.next和inner.next = inner.next.next的区别即可。
复杂度分析
两重循环，时间复杂度为 O(12n2)O(\frac{1}{2}n^2)O(21n2), 空间复杂度近似为 O(1)O(1)O(1).
*、