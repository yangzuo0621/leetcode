/**
 * 解题思路：
 * 最初想法将两个链表中的数字转换到数组中，然后对数组进行进行相加操作，再转换成链表。
 * 实现后发现利用栈可以直接在相加的时候进行链表的创建。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        LinkedList<ListNode> stack1 = new LinkedList<>();
        LinkedList<ListNode> stack2 = new LinkedList<>();
        ListNode t1 = l1, t2 = l2;
        while (t1 != null) { stack1.addLast(t1); t1 = t1.next; }
        while (t2 != null) { stack2.addLast(t2); t2 = t2.next; }
        int carry = 0;
        ListNode dummyNode = new ListNode(-1);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int sum = carry;
            if (!stack1.isEmpty()) sum += stack1.pollLast().val;
            if (!stack2.isEmpty()) sum += stack2.pollLast().val;
            ListNode node = new ListNode(sum % 10);
            node.next = dummyNode.next;
            dummyNode.next = node;
            carry = sum >= 10 ? 1 : 0;
        }
        if (carry > 0) {
          ListNode node = new ListNode(1);
          node.next = dummyNode.next;
          dummyNode.next = node;
        }
        return dummyNode.next;
    }
}
