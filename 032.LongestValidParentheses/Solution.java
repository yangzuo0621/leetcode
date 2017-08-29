import java.util.LinkedList;

/**
 * 解题思路：
 * 正确分析有效括号的情况。
 */
public class Solution {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) return 0;
        LinkedList<Integer> stack = new LinkedList<>();
        int start = 0, result = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(')
                stack.addLast(i);
            else if (s.charAt(i) == ')') {
                if (stack.isEmpty())
                    start = i + 1;
                else {
                    stack.pollLast();
                    if (stack.isEmpty()) {
                        result = Math.max(i - start + 1, result);
                    } else {
                        result = Math.max(i - stack.peekLast(), result);
                    }
                }
            }
        }
        return result;
    }
}
