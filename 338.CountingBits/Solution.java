/**
 * 解题思路：
 * 找出规律来。
 * 0 1 2 3 -> 000 001 010 110 -> 0 1 1 2
 * 4 5 6 7 -> 100 101 110 111 -> 1 2 2 3
 */
class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        result[0] = 0;
        if (num > 0) result[1] = 1;
        int step = 1, target = 2;
        for (int i = 2; i <= num; ++i) {
            if (i == target) {
                step = step << 1;
                target = target << 1;
            }
            result[i] = result[i-step] + 1;
        }
        return result;
    }
}