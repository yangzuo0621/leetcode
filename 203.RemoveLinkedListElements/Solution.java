/**
 * 解题思路：
 * 使用两个指针，一个指向待删除结点的前一个结点，一个指向待删除的结点。
 * 利用一个哑结点来简化头部为要删除结点的情形。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        while (head != null) {
            if (head.val == val) {
                pre.next = head.next;
                head = head.next;
            } else {
                head = head.next;
                pre = pre.next;
            }
        }
        return dummyNode.next;
    }
}