/**
 * 解题思路：
 * 创建一个哨兵统一操作，使用一个统计量计算保存进位以及相应数位的和。
 * 通过模运算和整数除计算进位跟余数。
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode node = dummyHead, p = l1, q = l2;
        int sum = 0;

        while(p != null || q != null) {
            if (p != null) {
                sum += p.val;
                p = p.next;
            }
            if (q != null) {
                sum += q.val;
                q = q.next;
            }
            node.next = new ListNode(sum % 10);
            node = node.next;
            sum /= 10;
        }
        if (sum > 0)
            node.next = new ListNode(sum);

        return dummyHead.next;
    }
}