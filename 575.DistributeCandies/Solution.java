import java.util.HashSet;
import java.util.Set;

/**
 * 解题思路：
 * 最开始相复杂了，没做出来。
 * 统计存在多少种不同的数字，
 * 如果种类多于总数的一半，则只能选总数的一半，否则不能平均分成两份；
 * 否则选择种类的个数。
 */
public class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies) {
            kinds.add(candy);
        }
        return Math.min(kinds.size(), candies.length / 2);
    }
}