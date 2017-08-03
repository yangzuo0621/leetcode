/**
 * 解题思路：
 * 使用堆来进行括号的匹配，
 * 当字符为'(', '{', '['时，入栈，
 * 当字符为')', '}', ']'时，根据情况出栈。
 * 当栈为空时返回true。
 * 注意考虑边界情况。
 */
public class Solution {

    public static boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
                continue;
            }
            if (c == ')') {
                if (top == -1 || stack[top] != '(') return false;
                top--;
                continue;
            }
            if (c == '}') {
                if (top == -1 || stack[top] != '{') return false;
                top--;
                continue;
            }
            if (c == ']') {
                if (top == -1 || stack[top] != '[') return false;
                top--;
            }
        }

        return (top == -1);
    }
}