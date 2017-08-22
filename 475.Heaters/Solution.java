import java.util.Arrays;

/**
 * 解题思路：
 * 找到每个房子能覆盖的最大距离。
 */
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int j = 0;
        int max = 0;
        int n = heaters.length;
        for (int i = 0; i < houses.length; ++i) {
            int cur = houses[i];
            while (j < n - 1 && Math.abs(heaters[j] - cur) >= Math.abs(heaters[j+1] - cur)) {
                ++j;
            }
            max = Math.max(max, Math.abs(heaters[j] - cur));
        }
        return max;
    }
}