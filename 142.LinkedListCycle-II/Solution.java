/**
 * 解题思路：
 * 快慢指针找到相遇点，在相遇点处逻辑上断开两个，构成两条有相交的链表
 * 再找到相交点。
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head, fast = head.next;
        int slowCnt = 1, fastCnt = 1;
        while (fast != null) {
            slow = slow.next;
            ++slowCnt;
            fast = fast.next;
            if (fast != null) fast = fast.next;
            if (slow == fast) {
                fast = fast.next;
                while (fast != slow) {
                    fast = fast.next;
                    ++fastCnt;
                }
                ListNode node1 = head;
                return findJointNode(node1, slowCnt, fast.next, fastCnt);
            }
        }
        return null;
    }

    private ListNode findJointNode(ListNode node1, int cnt1, ListNode node2, int cnt2) {
        if (cnt1 < cnt2) {
            ListNode tmp = node1;
            node1 = node2;
            node2 = tmp;
            int t = cnt1;
            cnt1 = cnt2;
            cnt2 = t;
        }

        int diff = cnt1 - cnt2;
        while (diff-- > 0) {
            node1 = node1.next;
        }

        while (node1 != node2) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = node1;
        System.out.println(new Solution().detectCycle(node1));
    }
}
