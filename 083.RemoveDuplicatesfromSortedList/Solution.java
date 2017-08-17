/**
 * 解题思路：
 * 考虑边界情况。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode work = head, cur = head;
        while (work != null) {
            if (work.val != cur.val) {
                cur.next = work;
                cur = work;
            }
            work = work.next;
        }
        cur.next = work;
        return head;
    }
}