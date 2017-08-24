/**
 * 解题思路：
 * 使用两个指针将odd和even分开串连。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head, evenHead = head.next, even = evenHead;
        ListNode work = head.next;
        while (work != null) {
            if (work.next != null) {
                odd.next = work.next;
                odd = odd.next;
                work = work.next;
            }
            if (work != null) {
                even.next = work.next;
                even = even.next;
                work = work.next;
            }
        }
        odd.next = evenHead;
        return head;
    }
}