import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 解题思路：
 * 用一个Map保存长度较短的list的元素和索引对应关系。
 * 再进行判断哪些元素符合要求。
 */
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            String[] tmp = list1;
            list1 = list2;
            list2 = tmp;
        }
        Map<String, Integer> table = new HashMap<>(list1.length);
        for (int i = 0; i < list1.length; i++) {
            table.put(list1[i], i);
        }
        int min = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (table.containsKey(list2[i])) {
                int distance = table.get(list2[i]) + i;
                if (min == distance) {
                    result.add(list2[i]);
                } else if (min > distance) {
                    min = distance;
                    result.clear();
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}