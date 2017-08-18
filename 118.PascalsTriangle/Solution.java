import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 解题思路：
 * 利用Pascal三角的规律。
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) return new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(Arrays.asList(1));
        if (numRows == 1) return resultList;
        resultList.add(Arrays.asList(1, 1));
        if (numRows == 2) return resultList;
        for (int i = 1; i < numRows - 1; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            List<Integer> tmp = resultList.get(i);
            for (int j = 1; j < tmp.size(); j++) {
                list.add(tmp.get(j-1) + tmp.get(j));
            }
            list.add(1);
            resultList.add(list);
        }
        return resultList;
    }
}