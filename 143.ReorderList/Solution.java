/**
 * 解题思路：
 * 使用一个栈保存链表的反向顺序，再将链表串接起来。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null) return;
        LinkedList<ListNode> stack = new LinkedList<>();
        int count = 0;
        ListNode node = head;
        while (node != null) {
            ++count;
            stack.addLast(node);
            node = node.next;
        }
        int half = count >> 1;
        node = head;
        while (half-- > 0) {
            ListNode top = stack.pollLast();
            top.next = node.next;
            node.next = top;
            node = top.next;
        }
        node.next = null;
    }
}
