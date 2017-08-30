/**
 * 解题思路：
 * 根据移动的距离区分出两条链表。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        ListNode node = head; // 统计并用于寻找链接最后的结点
        int count = 1;
        while (node.next != null) {
            ++count;
            node = node.next;
        }
        k = k % count;
        int diff = count - k;
        ListNode node1 = head; // 寻找移动后的末尾结点
        while (--diff > 0) {
            node1 = node1.next;
        }
        node.next = head;
        head = node1.next;
        node1.next = null;
        return head;
    }
}
