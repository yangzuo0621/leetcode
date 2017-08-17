import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 * 使用组合的思想，但没有实现出来。哭泣。
 */
public class Solution {

    final static int[] hour = new int[]{1, 2, 4, 8};
    final static int[] minute = new int[]{1, 2, 4, 8, 16, 32};

    public List<String> readBinaryWatch(int num) {
        if (num < 0 || num > 10) throw new IllegalArgumentException();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i <= num; i++){
            List<Integer> hours = generate(hour, i);
            List<Integer> minutes = generate(minute, num - i);
            for (Integer h : hours) {
                if (h > 11) continue;
                for (Integer m :minutes) {
                    if (m > 59) continue;
                    strings.add(String.valueOf(h) + (m < 10 ? ":0" : ":") + String.valueOf(m));
                }
            }
        }
        return strings;
    }

    private List<Integer> generate(int[] use, int cnt) {
        List<Integer> result = new ArrayList<>();
        helper(use, 0, cnt, 0, result);
        return result;
    }

    private void helper(int[] use, int pos, int cnt, int sum, List<Integer> result) {
        if (cnt == 0) {
            result.add(sum);
            return;
        }
        for (int i = pos; i < use.length; i++) {
            helper(use, pos + 1, cnt - 1, sum + use[i], result);
        }
    }
}