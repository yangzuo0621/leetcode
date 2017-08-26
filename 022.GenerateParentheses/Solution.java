import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 * 利用递归。
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(result, "", n, n);
        return null;
    }

    private void helper(List<String> result, String content, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(content);
        } else if (left > 0)
            helper(result,content + "(", left - 1, right);
        if (left < right)
            helper(result, content + ")", left, right - 1);
    }
}