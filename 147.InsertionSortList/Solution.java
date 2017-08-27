/**
 * 解题思路：
 * 利用递归。
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ListNode dummyNode = new ListNode(-1);
        ListNode pre, cur;
        dummyNode.next = head;
        head = head.next;
        dummyNode.next.next = null;
        while (head != null) {
            pre = dummyNode;
            cur = dummyNode.next;
            while (cur != null && head.val >= cur.val) {
                pre = cur;
                cur = cur.next;
            }
            pre.next = head;
            head = head.next;
            pre.next.next = cur;
        }
        return dummyNode.next;
    }
}
