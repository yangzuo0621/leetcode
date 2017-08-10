/**
 * 解题思路：
 * 最开始使用了hashmap来记录索引值。
 * 由于数组已经排序，故可以采用遍历的方式来进行查找。
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) return null;
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}