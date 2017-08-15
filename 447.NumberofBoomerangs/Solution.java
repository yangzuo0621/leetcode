import java.util.HashMap;
import java.util.Map;

/**
 * 解题思路：
 * 三重循环超时，使用一个map去记录相同距离的个数，并利用规律计算种类数。
 * map的put和get是有一定开销的。
 */
public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        if (points == null || points.length == 0) return 0;

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>(points.length);
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int distance = distance(points[i], points[j]);
                map.put(distance, map.getOrDefault(distance, 0) + 1);
            }

            for (int val : map.values()) {
                count += val * (val - 1);
            }

            map.clear();
        }
        return count;
    }

    private int distance(int[] point1, int[] point2) {
        int x = point1[0] - point2[0];
        int y = point1[1] - point2[1];
        return x * x + y * y;
    }
}