import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 * 递归。
 */
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        helper(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    private void helper(int count, int num, int cur, List<Integer> list, List<List<Integer>> result) {
        if (count == 0 && num != 0) return;
        if (count != 0 && num == 0) return;
        if (count == 0 && num == 0) {
            result.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        for (int i = cur; i <= 9; ++i) {
            list.add(i);
            helper(count - 1, num - i, i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }
}
