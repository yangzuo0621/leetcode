/**
 * 解题思路：
 * 判断两个链表最后的一个元素是否相同，不同则不想交，相同则香蕉，并统计两个链表的长度。
 * 用两个指针，一个先走diff步，然后两个同时走。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode p1 = headA, p2 = headB;
        int len1 = 1, len2 = 1;
        while (p1.next != null) {
            p1 = p1.next;
            len1++;
        }
        while (p2.next != null) {
            p2 = p2.next;
            len2++;
        }
        if (p1 != p2) return null;

        if (len1 > len2) {
            p1 = headA;
            p2 = headB;
        } else {
            p1 = headB;
            p2 = headA;
        }
        int diff = len1 > len2 ? len1 - len2 : len2 - len1;
        while (diff > 0) {
            p1 = p1.next;
            diff--;
        }
        while (p1.next != null && p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}