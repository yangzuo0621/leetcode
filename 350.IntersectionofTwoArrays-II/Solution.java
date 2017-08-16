import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 解题思路：
 * 利用了一个map来统计一个数组中出现数的频率。
 * 也可以利用排序后进行求解。
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        if (len1 > len2) {
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }
        Map<Integer, Integer> table = new HashMap<>(nums1.length);
        for (int i = 0; i < nums1.length; i++) {
            table.put(nums1[i], table.getOrDefault(nums1[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (table.containsKey(nums2[i]) && table.get(nums2[i]) != 0) {
                list.add(nums2[i]);
                table.put(nums2[i], table.get(nums2[i]) - 1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        return result;
    }
}
