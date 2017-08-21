/**
 * 解题思路：
 * 将链表前半段进行倒转，再与后半段进行比较。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode p1 = head;
        int count = 0;
        while (p1 != null) {
            ++count;
            p1 = p1.next;
        }
        int half = count >>> 1;
        ListNode p2 = null;
        p1 = head;
        while (half-- > 0) {
            head = head.next;
            p1.next = p2;
            p2 = p1;
            p1 = head;
        }
        if (count % 2 == 1) p1 = p1.next;
        while (p2 != null && p1 != null) {
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        ListNode node1 = new ListNode(0);
        node.next = node1;
        System.out.println(new Solution().isPalindrome(node));
    }
}