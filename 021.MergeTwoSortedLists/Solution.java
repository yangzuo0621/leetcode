/**
 * 解题思路：
 * 由于两个链表本身已有序，只需要用一个结点来修改链表之间的关系。
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dumpNode = new ListNode(0);
        ListNode curNode = dumpNode;
        ListNode p1 = l1, p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                curNode.next = p1;
                p1 = p1.next;
            } else {
                curNode.next = p2;
                p2 = p2.next;
            }
            curNode = curNode.next;
        }
        if (p1 != null) curNode.next = p1;
        if (p2 != null) curNode.next = p2;

        return dumpNode.next;
    }
}
