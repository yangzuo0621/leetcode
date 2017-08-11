import java.util.HashSet;
import java.util.Set;

/**
 * 解题思路：m
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        int[] arr = new int[result.size()];
        int index = 0;
        for (Integer i : result) {
            arr[index++] = i;
        }

        return arr;
    }
}