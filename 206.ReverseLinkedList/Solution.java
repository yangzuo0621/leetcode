/**
 * 解题思路：
 * 倒插法。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode cur = head;
        head = null;
        while (cur != null) {
            ListNode tmp = cur;
            cur = cur.next;
            tmp.next = head;
            head = tmp;
        }
        return head;
    }
}