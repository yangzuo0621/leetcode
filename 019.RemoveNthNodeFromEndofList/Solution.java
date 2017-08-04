class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * 解题思路：
 * 利用两个指针p1和p2，第一个指针p1先走n步，接着两个指针同时走，直到p1.next为空。
 * 此时p2所在的结点即为要删除的倒数第n个结点的前一个结点。
 * 注意考虑删除头结点的情况。这里假设输入的n有效，即0 <= n <= 链表长度。
 * 当要删除的时头结点时，第一个指针是为null的。
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) return head;

        ListNode p1 = head;
        ListNode p2 = head;
        while (n-- > 0 && p1 != null) {
            p1 = p1.next;
        }

        if (p1 == null) {
            return head.next;
        }

        while (p1.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        p2.next = p2.next.next;
        return head;
    }
}