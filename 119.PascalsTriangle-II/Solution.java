import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 解题思路：
 * 保存前一个需要使用到的数据变量。
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) return new ArrayList<>();
        Integer[] pascal = new Integer[rowIndex + 1];
        pascal[0] = 1;
        pascal[rowIndex] = 1;
        if (rowIndex > 1) {
            pascal[1] = 1;
            for (int i = 2; i <= rowIndex; i++) {
                int pre = pascal[0];
                for (int j = 1; j < i; j++) {
                    int tmp = pascal[j];
                    pascal[j] = pre + pascal[j];
                    pre = tmp;
                }
                pascal[i] = 1;
            }
        }
        return Arrays.asList(pascal);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().getRow(4));
    }
}