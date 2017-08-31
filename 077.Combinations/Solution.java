/**
 * 解题思路：
 * 递归。
 */
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generate(k, 1, n, new ArrayList<>(), result);
        return result;
    }

    private void generate(int count, int start, int end, List<Integer> list, List<List<Integer>> result) {
        if (count < 0) return;
        if (count == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= end; ++i) {
            list.add(i);
            generate(count - 1, i + 1, end, list, result);
            list.remove(list.size() - 1);
        }
    }
}
